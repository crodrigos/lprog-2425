package org.lprog.ui.model;

import org.lprog.App;
import org.lprog.domain.drone.Drone;
import org.lprog.domain.model.Model;
import org.lprog.repo.model.ModelRepo;
import org.lprog.ui.utils.ConsoleUtils.ConsoleUtils;
import org.lprog.ui.utils.ConsoleUtils.MenuOption;

import java.util.ArrayList;
import java.util.List;

public class ModelUI implements Runnable{

    Runnable listModels = new Runnable() {
        @Override
        public void run() {
            ModelRepo modelRepo = App.getInstance().Repos.modelRepo;

            if (!modelRepo.repoList.isEmpty()) {
                try {
                    List<String> modelNames = modelRepo.repoList.stream().map(model -> model.ModelName).toList();
                    String modelName = (String) ConsoleUtils.showAndSelectOne(modelNames,"Modelos Disponiveis");

                    ConsoleUtils.printMessage(App.getInstance().Repos.modelRepo.findByModelName(modelName).toString());

                } catch (Exception e) {}
            }
            else {
                ConsoleUtils.printMessage("Nenhum modelo de drone encontrado");
            }

        }
    };

    Runnable listarDronesPorModelo = () -> {
        List<Model> modelos = App.getInstance().Repos.modelRepo.repoList;

        if (modelos.isEmpty()) {
            ConsoleUtils.printMessage("Nenhum modelo de drone disponível.");
            return;
        }

        List<String> nomes = modelos.stream().map(model -> model.ModelName).toList();
        int escolha = ConsoleUtils.showAndSelectIndex(nomes, "Seleciona um modelo");

        if (escolha == -1) return;

        String modeloSelecionado = nomes.get(escolha);
        List<Drone> drones = App.getInstance().Repos.droneRepo.repoList;

        List<Drone> associados = drones.stream()
            .filter(d -> d.model.ModelName.equals(modeloSelecionado))
            .toList();

        if (associados.isEmpty()) {
            ConsoleUtils.printMessage("Nenhum drone encontrado para o modelo " + modeloSelecionado);
        } else {
            System.out.println("\n--- Drones do modelo " + modeloSelecionado + " ---");
            for (Drone d : associados) {
                System.out.println("Serial: " + d.serialNumber + ", Estado: " + d.status + ", Voo: " + d.flightTime + "min");
            }
        }
    };

    @Override
    public void run() {
        List<MenuOption> options = new ArrayList<MenuOption>();
        options.add(new MenuOption("Listar modelos", listModels));
        options.add(new MenuOption("Adicionar Modelos", new AddModelUI()));
        options.add(new MenuOption("Listar drones por modelo", listarDronesPorModelo));
        ConsoleUtils.showAndSelectMenu(options,"Gestão de modelos de drone");
    }

}
