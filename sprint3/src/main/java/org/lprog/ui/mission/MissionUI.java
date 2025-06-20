package org.lprog.ui.mission;

import org.lprog.App;
import org.lprog.domain.drone.Drone;
import org.lprog.domain.mission.Mission;
import org.lprog.domain.mission.Point;
import org.lprog.domain.mission.Status;
import org.lprog.domain.model.Model;
import org.lprog.grammar.mission.MissionVisitorImpl;
import org.lprog.repo.drone.DroneRepo;
import org.lprog.repo.mission.MissionRepo;
import org.lprog.repo.model.ModelRepo;
import org.lprog.ui.utils.ConsoleUtils.ConsoleUtils;
import org.lprog.ui.utils.ConsoleUtils.MenuOption;

import java.io.PrintWriter;
import java.util.*;

public class MissionUI implements Runnable {

    @Override
    public void run() {

        updateMissionsAndDrones();

        List<MenuOption> options = new ArrayList<>();
        options.add(new MenuOption("Carregar missões através de ficheiro", this::loadMissionsMenu));
        options.add(new MenuOption("Criar missão", this::manuallyAddMission));
        options.add(new MenuOption("Listar missões", this::listMissions));
        options.add(new MenuOption("Associar drone", this::associateDrone));
        options.add(new MenuOption("Associar Modelo", this::associateModel));
        options.add(new MenuOption("Exportar missões para ficheiro", this::exportMissionsMenu));
        options.add(new MenuOption("Executar missão", this::executeMission));
        ConsoleUtils.showAndSelectMenu(options, "Gestão de Missões");
    }

    private void addMissionToRepo (Mission mission) {
        MissionRepo missionsRepo = App.getInstance().Repos.missionRepo;

        if (mission.modelName != null) {
            mission.setModel(App.getInstance().Repos.modelRepo.findByModelName(mission.modelName));
            if (mission.model == null)
                ConsoleUtils.printMessage("Não foi encontrado um modelo para esse nome, por favor adicione-o manualmente depois.");
        }

        missionsRepo.add(mission);
        ConsoleUtils.printMessage("Missão adicionada com sucesso!");
        ConsoleUtils.printMessage("Missão: " + mission);
    }

    private void associateDrone() {
        Mission missionOption = (Mission) ConsoleUtils.showAndSelectOne(App.getInstance().Repos.missionRepo.repoList, "Selecione uma das missões:");
        Drone droneOption = (Drone) ConsoleUtils.showAndSelectOne(App.getInstance().Repos.droneRepo.repoList, "Selecione um dos drones:");

        missionOption.setDrone(droneOption);
    }

    private void associateModel() {
        Mission missionOption = (Mission) ConsoleUtils.showAndSelectOne(App.getInstance().Repos.missionRepo.repoList, "Selecione uma das missões:");
        Model modelOption = (Model) ConsoleUtils.showAndSelectOne(App.getInstance().Repos.modelRepo.repoList, "Selecione um dos modelos:");

        missionOption.setModel(modelOption);
        missionOption.setModelName(modelOption.ModelName);
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
            missions.forEach((mission) -> {addMissionToRepo(mission);});
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

        mission.setModelName(modelName);

        addMissionToRepo(mission);
    }

    private void listMissions() {
        List<Mission> missions = loadMissions();
        if (!missions.isEmpty()) {
            ConsoleUtils.showList(missions, "Missões Disponíveis");
        } else {
            ConsoleUtils.printMessage("Nenhuma missão encontrada");
        }
    }

    private void executeMission() {
        List<Mission> missions = App.getInstance().Repos.missionRepo.repoList;
        missions.sort((o1, o2) -> {
            return o1.startDate.compareTo(o2.startDate);
        });

        Mission mission = (Mission) ConsoleUtils.showAndSelectOne(missions, "Selecione uma Missão a ser executada");

        // Verificar se missão existe e se é valida
        if (mission != null) {
            DroneRepo droneRepo = App.getInstance().Repos.droneRepo;
            ModelRepo modelRepo = App.getInstance().Repos.modelRepo;

            Model m = modelRepo.findByModelName(mission.modelName);

            double missionLenght = mission.getTotalDistance();

            if (m==null || m.Autonomy<missionLenght) {

                if (m==null) ConsoleUtils.printError("Não existe modelo associado a missão");
                else if (m.Autonomy<missionLenght) ConsoleUtils.printError("Modelo " + m.ModelName + " não é adequado para missão");

                // Checkar repo de modelos para ver se existe algum modelo que possa fazer as deliveries
                List<Model> goodModels = searchModelsForMission(mission);

                Model newModel = (Model) ConsoleUtils.showAndSelectOne(goodModels, "Selecionar novo modelo para executar missão");

                mission.modelName = newModel.ModelName;
            }
        }
        else {
            ConsoleUtils.printMessage("Não existem modelos associados a esta missão");

            List<Model> goodModels = searchModelsForMission(mission);

            if (!goodModels.isEmpty()) {
                Model newModel = (Model) ConsoleUtils.showAndSelectOne(goodModels, "Selecionar novo modelo para executar missão");
                mission.modelName = newModel.ModelName;
            }
        }

        if (mission.startDate.compareTo(Calendar.getInstance().getTime())>0) {
            ConsoleUtils.printMessage("A missão está marcada para executar na data " + mission.startDate.toString());
            List<String> opts = new ArrayList<>();
            opts.add("Sim");
            opts.add("Nao");
            int i = ConsoleUtils.selectsIndex(opts, "Tem a certeza que deseja executar a missão de qualquer maneira?");

            if (i==1) return;



        }

        ConsoleUtils.printMessage("A procurar drone para executar missão...");

        Model m = App.getInstance().Repos.modelRepo.findByModelName(mission.modelName);

        Drone d = (Drone) ConsoleUtils.showAndSelectOne(searchAvailableDronesByModel(m), "Selecionar drone para executar");

        mission.drone = d;
        mission.setStatus(Status.Ongoing);
        d.status = org.lprog.domain.drone.Status.FLYN;
    }

    private void updateMissionsAndDrones() {

        List<Mission> missions = App.getInstance().Repos.missionRepo.repoList;

        Date now = Calendar.getInstance().getTime();

        ConsoleUtils.printMessage(now.toString());

        for (Mission mission : missions) {
            double duration = mission.CalculateMissionDuration();

            Date expectedEnd = addSecondsToDate(mission.startDate, duration);

            if (expectedEnd.compareTo(now)>0) {

                ConsoleUtils.printMessage(expectedEnd.toString());

                mission.status = Status.Done;

                if (mission.drone!=null) {
                    mission.drone.status = org.lprog.domain.drone.Status.IDLE;
                }

            }
        }
    }

    public Date addSecondsToDate(Date date, double seconds) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.SECOND, (int) seconds);
        return calendar.getTime();
    }

    private List<Drone> searchAvailableDronesByModel(Model model) {
        List<Drone> droneList = new ArrayList<>();

        List<Drone> allDrone = App.getInstance().Repos.droneRepo.repoList;

        for (Drone drone : allDrone) {
            if (drone.model.equals(model)) {
                droneList.add(drone);
            }
        }

        return droneList;
    }

    private List<Model> searchModelsForMission(Mission mission) {
        ConsoleUtils.printMessage("A procurar possiveis modelos para executar missão...");

        ConsoleUtils.printMessage("Distancia da missão: " + mission.getTotalDistance());

        List<Model> goodModels = new ArrayList<>();
        App.getInstance().Repos.modelRepo.repoList.forEach(model -> {
            ConsoleUtils.printMessage(model.ModelName + ": " + model.Autonomy);
            if (model.Autonomy>=mission.getTotalDistance()) goodModels.add(model);
        });

        if (goodModels.isEmpty()) {
            ConsoleUtils.printError("Não existem modelos capazes de executar a missão");
        }

        return goodModels;
    }

    private static List<Mission> loadMissions() {
        return App.getInstance().Repos.missionRepo.repoList;
    }

}
