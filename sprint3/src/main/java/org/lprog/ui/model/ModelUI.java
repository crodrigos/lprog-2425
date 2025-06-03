package org.lprog.ui.model;

import org.lprog.App;
import org.lprog.repo.drone.DroneRepo;
import org.lprog.repo.model.ModelRepo;
import org.lprog.ui.utils.ConsoleColors;
import org.lprog.ui.utils.ConsoleUtils;
import org.lprog.ui.utils.MenuOption;

import java.util.ArrayList;
import java.util.List;

public class ModelUI implements Runnable{

    Runnable listModels = new Runnable() {
        @Override
        public void run() {
            ModelRepo modelRepo = App.getInstance().Repos.modelRepo;

            if (!modelRepo.repoList.isEmpty()) {
                List<String> modelNames = modelRepo.repoList.stream().map(model -> model.ModelName).toList();
                ConsoleUtils.showList(modelNames,"Modelos Disponiveis");
            }
            else {
                ConsoleUtils.printMessage("Nenhum modelo de drone encontrado");
            }

        }
    };

    @Override
    public void run() {
        MenuOption opt1 = new MenuOption("Listar modelos", listModels);
        List<MenuOption> options = new ArrayList<MenuOption>();
        options.add(opt1);
        ConsoleUtils.showAndSelectMenu(options,"Gestão de modelos de drone");

    }

}
