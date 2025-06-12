package org.lprog.ui.mission;

import org.lprog.App;
import org.lprog.domain.drone.Drone;
import org.lprog.domain.mission.Mission;
import org.lprog.domain.mission.Point;
import org.lprog.ui.utils.ConsoleUtils;
import org.lprog.ui.utils.MenuOption;

import java.util.*;
import java.util.stream.Collectors;

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
        // FALTA ISTO
    }

    private void exportMissionsToFile(String fileName) {
        // FALTA ISTO
    }

    private void manuallyAddMission() {
        int id = ConsoleUtils.readIntegerFromConsole("Insira o ID da missão (deve ser único XXX):");

        Date startDate = ConsoleUtils.readDateFromConsole("Data de início da missão (AAAA-MM-DD,HH:MM): ");

        String startingPoint = ConsoleUtils.readLineFromConsole("Ponto de partida (latitude,altitude,longitude): ");
        String[] coords = startingPoint.split(",");
        Point startingPointObj = new Point(Double.parseDouble(coords[0]),
                Double.parseDouble(coords[1]),
                Integer.parseInt(coords[2]));

        Mission mission = new Mission(id, startDate, startingPointObj);

        System.out.println("Insira os pontos para entrega linha por linha,");
        System.out.println("ou 'fim' para terminar a inserção de pontos.");

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

        int index = ConsoleUtils.showAndSelectIndex(App.getInstance().Repos.droneRepo.repoList,
                "Selecione o drone para esta missão: ");
        if (index < 0 || index >= App.getInstance().Repos.droneRepo.repoList.size()) {
            ConsoleUtils.printMessage("Seleção inválida. Missão não adicionada.");
            ConsoleUtils.printMessage("Estes são os drones disponíveis:");
            ConsoleUtils.showList(App.getInstance().Repos.droneRepo.repoList, "Drones Disponíveis");
            return;
        }
        mission.setDrone(App.getInstance().Repos.droneRepo.repoList.get(index));
        App.getInstance().Repos.missionRepo.repoList.add(mission);
        ConsoleUtils.printMessage("Missão adicionada com sucesso!");

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
