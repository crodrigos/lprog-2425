package org.lprog.bootstrap;

import org.lprog.App;
import org.lprog.domain.drone.Drone;
import org.lprog.domain.drone.Status;
import org.lprog.domain.model.Model;
import org.lprog.domain.model.Sensor;
import org.lprog.ui.utils.ConsoleColors;
import org.lprog.ui.utils.ConsoleUtils;

import java.util.ArrayList;

public class RepoBootstrap implements Runnable {

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
        Model modelo = App.getInstance().Repos.modelRepo.repoList.stream()
                .filter(m -> m.ModelName.equals("FX-001"))
                .findFirst()
                .orElse(null);

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

    @Override
    public void run() {
        ConsoleUtils.printMessage("\nBOOTSTRAP");

        AddModels();
        AddDrones();
        System.out.println(ConsoleColors.RESET);
    }

}
