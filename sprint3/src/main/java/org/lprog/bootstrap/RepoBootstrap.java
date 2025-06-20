package org.lprog.bootstrap;

import org.lprog.App;
import org.lprog.domain.drone.Drone;
import org.lprog.domain.drone.Status;
import org.lprog.domain.mission.Mission;
import org.lprog.domain.mission.Point;
import org.lprog.domain.model.Model;
import org.lprog.domain.model.Sensor;
import org.lprog.ui.utils.ConsoleUtils.*;
import org.lprog.ui.utils.ConsoleUtils.ConsoleUtils;

import java.util.ArrayList;

public class RepoBootstrap implements Runnable {

    @Override
    public void run() {
        ConsoleUtils.printMessage("\nBOOTSTRAP");

        AddModels();
        AddDrones();
        AddMissions();
        System.out.println(ConsoleColors.RESET);
    }

    private void AddModels() {
        ConsoleUtils.printMessageWithColor("\nAdding models", ConsoleColors.WHITE_BRIGHT);
        Model model1 = new Model(
                "FX001",
                1000,
                9000,
                3000,
                2000,
                25,
                new ArrayList<Sensor>(),
                new ArrayList<String>());

        AddModel(model1);
    }

    private void AddModel(Model model) {
        App.getInstance().Repos.modelRepo.add(model);
    }

    private void AddDrones() {

        ConsoleUtils.printMessageWithColor("\nAdding Drones", ConsoleColors.WHITE_BRIGHT);

        // Buscar o modelo "FX-001" do repositório
        Model modelo = getModel("FX001");

        if (modelo == null) {
            ConsoleUtils.printMessageWithColor("Modelo FX-001 não encontrado no repositório!",
                    ConsoleColors.RED_BRIGHT);
            return;
        }

        Drone drone1 = new Drone(
                "D-R0DR1G05",
                120,
                modelo,
                new ArrayList<>(),
                Status.IDLE);

        // Adicionar ao repositório partilhado
        App.getInstance().Repos.droneRepo.repoList.add(drone1);

        ConsoleUtils.printMessage(drone1.toString());
    }

    private void AddMissions () {
        ConsoleUtils.printMessageWithColor("\nAdding missions", ConsoleColors.WHITE_BRIGHT);

        Mission mission1 = new Mission(
            "2025-07-27,09:37",
                "FX001",
                new Point(
                    90, // Latitude
                        90, // Altitude
                    -90// Longitude
                ),
                genPointsList(6)

        );

        AddMission(mission1);

    }

    private void AddMission(Mission mission) {
        ConsoleUtils.printMessage(mission.toString());
        App.getInstance().Repos.missionRepo.add(mission);
    }

    private ArrayList<Point> genPointsList(int numOfPoints) {
        ArrayList<Point> points = new ArrayList<>();
        for (int i = 0; i < numOfPoints; i++) {
            double latitude = 90 + 0.001*i; // Latitude range: -90 to 90
            double longitude = 90 + 0.001*i; // Longitude range: -180 to 180
            double altitude = 90 + 0.001*i; // Altitude range: 0 to 999

            Point point = new Point(latitude, altitude, longitude);
            points.add(point);
        }
        return points;
    }

    private Model getModel (String modelName) {
        return App.getInstance().Repos.modelRepo.repoList.stream()
                .filter(m -> m.ModelName.equals(modelName))
                .findFirst()
                .orElse(null);
    }

}
