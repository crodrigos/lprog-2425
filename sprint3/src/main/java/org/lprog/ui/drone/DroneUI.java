package org.lprog.ui.drone;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.lprog.App;
import org.lprog.domain.drone.Drone;
import org.lprog.domain.drone.Status;
import org.lprog.domain.model.Model;
import org.lprog.grammar.drone.*;
import org.lprog.ui.utils.ConsoleUtils;
import org.lprog.ui.utils.MenuOption;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

public class DroneUI implements Runnable {

    private static final Map<String, Model> modelosDisponiveis = carregarModelos();
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public void run() {
        List<MenuOption> options = new ArrayList<>();
        options.add(new MenuOption("Carregar frota de ficheiro", this::carregarFrotaMenu));
        options.add(new MenuOption("Adicionar drone", this::adicionarDroneManualmente));
        options.add(new MenuOption("Listar frota", this::listarFrota));
        options.add(new MenuOption("Exportar frota para ficheiro", this::exportarFrotaMenu));
        ConsoleUtils.showAndSelectMenu(options, "Gestão de Frotas");
    }

    private void carregarFrotaMenu() {
        System.out.print("Caminho do ficheiro: ");
        String path = scanner.nextLine();
        carregarFrotaDeFicheiro(path);
    }

    private void exportarFrotaMenu() {
        System.out.print("Nome do ficheiro destino: ");;
        exportarFrotaParaFicheiro();
    }

    private static void carregarFrotaDeFicheiro(String filePath) {
        try (InputStream is = new FileInputStream(filePath)) {
            CharStream input = CharStreams.fromStream(is);
            DroneFleetLexer lexer = new DroneFleetLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            DroneFleetParser parser = new DroneFleetParser(tokens);

            ParseTree tree = parser.fleet();
            DroneFleetVisitorImpl visitor = new DroneFleetVisitorImpl(modelosDisponiveis);

            DroneFleetParser.FleetContext fleet = (DroneFleetParser.FleetContext) tree;
            for (DroneFleetParser.DroneEntryContext droneCtx : fleet.droneEntry()) {
                Drone drone = visitor.visitDroneEntry(droneCtx);
                App.getInstance().Repos.droneRepo.repoList.add(drone);
                System.out.println("Drone carregado: " + drone.serialNumber);
            }

        } catch (Exception e) {
            System.err.println("Erro ao carregar frota: " + e.getMessage());
        }
    }

    private void listarFrota() {
        List<Drone> drones = App.getInstance().Repos.droneRepo.repoList;

        if (drones.isEmpty()) {
            System.out.println("Frota vazia.");
            return;
        }

        for (Drone drone : drones) {
            System.out.println("\n--- Drone ---");
            System.out.println("Serial Number: " + drone.serialNumber);
            System.out.println("Modelo: " + drone.model.ModelName);
            System.out.println("Estado: " + drone.status);
            System.out.println("Tempo de voo: " + drone.flightTime);
            System.out.println("Restrições: " + (drone.restrictions.isEmpty() ? "Nenhuma" : drone.restrictions));
        }
    }

    private static void exportarFrotaParaFicheiro() {
    String filePath = "frota_exportada.txt";

    try (PrintWriter writer = new PrintWriter(filePath)) {
        List<Drone> drones = App.getInstance().Repos.droneRepo.repoList;

        for (Drone drone : drones) {
            writer.println("drone: {");
            writer.println("  SN:" + drone.serialNumber + ";");
            writer.println("  TV:" + drone.flightTime + ";");
            writer.println("  MD:" + drone.model.ModelName + ";");

            if (!drone.restrictions.isEmpty()) {
                writer.print("  RT:[");
                writer.print(String.join(", ", drone.restrictions.stream()
                        .map(r -> "\"" + r + "\"").toList()));
                writer.println("];");
            }

            writer.println("  EA:" + drone.status + ";");
            writer.println("}");
        }

        System.out.println("Frota exportada com sucesso para " + filePath);

    } catch (Exception e) {
        System.err.println("Erro ao exportar frota: " + e.getMessage());
    }
}

    private static Map<String, Model> carregarModelos() {
        Map<String, Model> modelos = new HashMap<>();
        List<Model> lista = App.getInstance().Repos.modelRepo.repoList;

        for (Model model : lista) {
            modelos.put(model.ModelName, model);
        }

        return modelos;
    }

    private void adicionarDroneManualmente() {
        try {
            System.out.print("Número de Série (ex: D-ABC123456): ");
            String serialNumber = scanner.nextLine();

            if (serialNumber.length() != 10 || serialNumber.charAt(1) != '-') {
                System.out.println("Erro: número de série inválido.");
                return;
            }

            System.out.print("Tempo de voo (min): ");
            int flightTime = Integer.parseInt(scanner.nextLine());

            System.out.print("Modelo (ex: FX-001): ");
            String modelName = scanner.nextLine();

            Model model = modelosDisponiveis.get(modelName);
            if (model == null) {
                System.out.println("Erro: modelo não encontrado.");
                return;
            }

            System.out.print("Estado (FLYN, IDLE, CHRG, MNTC, UNAV): ");
            String estadoStr = scanner.nextLine();
            Status status;
            try {
                status = Status.valueOf(estadoStr);
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: estado inválido.");
                return;
            }

            System.out.print("Restrições (separadas por vírgulas, ou vazio): ");
            String restricoesStr = scanner.nextLine();
            List<String> restricoes = new ArrayList<>();
            if (!restricoesStr.isBlank()) {
                restricoes = Arrays.stream(restricoesStr.split(","))
                        .map(String::trim)
                        .filter(s -> !s.isEmpty())
                        .toList();
            }

            Drone drone = new Drone(serialNumber, flightTime, model, restricoes, status);
            App.getInstance().Repos.droneRepo.repoList.add(drone);

            System.out.println("Drone adicionado com sucesso!");

        } catch (Exception e) {
            System.out.println("Erro ao adicionar drone: " + e.getMessage());
        }
    }
}
