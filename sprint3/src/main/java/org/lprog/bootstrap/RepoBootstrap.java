package org.lprog.bootstrap;

import org.lprog.App;
import org.lprog.domain.drone.Drone;
import org.lprog.domain.drone.Status;
import org.lprog.domain.mission.;
import org.lprog.domain.mission.Point;
import org.lprog.domain.model.Model;
import org.lprog.domain.model.Sensor;
import org.lprog.ui.utils.ConsoleUtils.*;
import org.lprog.ui.utils.ConsoleUtils.ConsoleUtils;

import java.util.ArrayList;
import java.util.Date;

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
                "FX-001",
                1000,
                90,
                30,
                20,
                25,
                new ArrayList<Sensor>(),
                new ArrayList<String>());

        AddModel(model1);
    }

    private void AddModel(Model model) {
        System.out.println(model.toString());
        App.getInstance().Repos.modelRepo.add(model);
    }

    private void AddDrones() {

        // Buscar o modelo "FX-001" do repositório
        Model modelo = getModel("FX-001");

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
                Status.CHRG);

        // Adicionar ao repositório partilhado
        App.getInstance().Repos.droneRepo.repoList.add(drone1);

        ConsoleUtils.printMessage("Drone adicionado com sucesso.");
    }

    private void AddMissions () {
        ConsoleUtils.printMessageWithColor("\nAdding missions", ConsoleColors.WHITE_BRIGHT);

        Drone drone = App.getInstance().Repos.droneRepo.repoList.stream()
                .filter(d -> d.serialNumber.equals("D-R0DR1G05"))
                .findFirst()
                .orElse(null);

        if (drone == null) {
            ConsoleUtils.printMessageWithColor("Modelo FX-001 não encontrado no repositório!",
                    ConsoleColors.RED_BRIGHT);
            return;
        }

        Mission mission1 = new Mission(
            new Date(2025, 06, 14),
                drone,
                new Point(
                    40, // Latitude
                        50, // Altitude
                    -74// Longitude
                ),
                genPointsList(6)

        );

        AddMission(mission1);

    }

    private void AddMission(Mission mission) {
        System.out.println(mission.toString());
        App.getInstance().Repos.missionRepo.add(mission);
    }

    private ArrayList<Point> genPointsList(int numOfPoints) {
        ArrayList<Point> points = new ArrayList<>();
        for (int i = 0; i < numOfPoints; i++) {
            int latitude = (int) (Math.random() * 180) - 90; // Latitude range: -90 to 90
            int longitude = (int) (Math.random() * 360) - 180; // Longitude range: -180 to 180
            int altitude = (int) (Math.random() * 1000); // Altitude range: 0 to 999

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
