package org.lprog.ui.mission;

import org.lprog.App;
import org.lprog.domain.mission.Mission;
import org.lprog.domain.mission.Point;
import org.lprog.grammar.mission.MissionVisitorImpl;
import org.lprog.repo.mission.MissionRepo;
import org.lprog.ui.utils.ConsoleUtils.ConsoleUtils;
import org.lprog.ui.utils.ConsoleUtils.MenuOption;

import java.io.PrintWriter;
import java.util.*;

public class MissionUI implements Runnable {

    @Override
    public void run() {
        List<MenuOption> options = new ArrayList<>();
        options.add(new MenuOption("Carregar missões através de ficheiro", this::loadMissionsMenu));
        options.add(new MenuOption("Criar missão", this::manuallyAddMission));
        options.add(new MenuOption("Listar missões", this::listMissions));
        options.add(new MenuOption("Exportar missões para ficheiro", this::exportMissionsMenu));
        ConsoleUtils.showAndSelectMenu(options, "Gestão de Missões");
    }

    private void loadMissionsMenu() {
        String path = ConsoleUtils.readLineFromConsole("Caminho do ficheiro: ");
        loadMissionsFromFile(path);
    }

    private void exportMissionsMenu() {
        String fileName = ConsoleUtils.readLineFromConsole("Nome do ficheiro destino: ");
        exportMissionsToFile(fileName);
    }

    private void loadMissionsFromFile(String filePath) {
        try {
            List<Mission> missions = MissionVisitorImpl.GetMissionFromFile(filePath);
            MissionRepo missionsRepo = App.getInstance().Repos.missionRepo;
            missions.forEach((mission) -> {missionsRepo.add(mission);});
        } catch (Exception e) {
            ConsoleUtils.printError("Erro ao carregar missões do ficheiro: " + e.getMessage());
        }
    }

    private void exportMissionsToFile(String fileName) {
        if (fileName == null || fileName.isEmpty()) {
            fileName = "missoes-exported.txt";
        }

        try (PrintWriter writer = new PrintWriter(fileName)) {
            List<Mission> missions = loadMissions();

            if (missions.isEmpty()) {
                ConsoleUtils.printMessage("Nenhuma missão para exportar.");
                return;
            }
            for (Mission mission : missions) {
                writer.println(mission.toString());
            }
            ConsoleUtils.printMessage("Missões exportadas com sucesso para " + fileName);
        } catch (Exception e) {
            ConsoleUtils.printError("Erro ao exportar missões: " + e.getMessage());
        }
    }

    private void manuallyAddMission() {

        String startDate = ConsoleUtils.readLineFromConsole("Data de início da missão (AAAA-MM-DD,HH:MM): ");

        String startingPoint = ConsoleUtils.readLineFromConsole("Ponto de partida (latitude,altitude,longitude): ");
        try {
            String[] coords = startingPoint.split(",");
            if (coords.length != 3) {
                throw new NumberFormatException("Formato inválido. Use 'latitude,altitude,longitude'.");
            }
        } catch (NumberFormatException e) {
            ConsoleUtils.printMessage("Formato inválido. Use 'latitude,altitude,longitude'.");
            return;
        }
        String[] coords = startingPoint.split(",");
        Point startingPointObj = new Point(Double.parseDouble(coords[0]),
                Double.parseDouble(coords[1]),
                Integer.parseInt(coords[2]));

        Mission mission = new Mission(startDate, startingPointObj);

        ConsoleUtils.printMessage("Insira os pontos para entrega linha por linha,");
        ConsoleUtils.printMessage("ou 'fim' para terminar a inserção de pontos.");

        while (true) {
            String input = ConsoleUtils.readLineFromConsole("Ponto de entrega: ");
            if (input.equalsIgnoreCase("fim")) {
                break;
            }
            try {
                mission.addPoint(input);
            } catch (NumberFormatException e) {
                ConsoleUtils.printMessage("Formato inválido. Use 'latitude,altitude,longitude'.");
            }
        }

        String modelName = ConsoleUtils.readLineFromConsole("Nome do modelo do drone: ");

        mission.setModel(modelName);
        
        App.getInstance().Repos.missionRepo.repoList.add(mission);
        ConsoleUtils.printMessage("Missão adicionada com sucesso!");
        ConsoleUtils.printMessage("Missão: " + mission);

    }

    private void listMissions() {
        List<Mission> missions = loadMissions();
        if (!missions.isEmpty()) {
            ConsoleUtils.showList(missions, "Missões Disponíveis");
        } else {
            ConsoleUtils.printMessage("Nenhuma missão encontrada");
        }
    }

    private static List<Mission> loadMissions() {
        return App.getInstance().Repos.missionRepo.repoList;
    }

}
