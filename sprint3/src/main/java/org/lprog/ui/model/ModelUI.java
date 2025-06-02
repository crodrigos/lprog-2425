package org.lprog.ui.model;

import org.lprog.App;
import org.lprog.repo.drone.DroneRepo;
import org.lprog.ui.utils.ConsoleUtils;
import org.lprog.ui.utils.MenuOption;

import java.util.ArrayList;
import java.util.List;

public class ModelUI implements Runnable{

    @Override
    public void run() {

        MenuOption opt1 = new MenuOption("Listar modelos", new Runnable() {
            @Override
            public void run() {
                DroneRepo droneRepo = App.getInstance().Repos.droneRepo;

                if (droneRepo.getList().size() > 0) {
                    for (int i = 0; i < droneRepo.getList().size(); i++) {
                        System.out.println(droneRepo.getList().get(i));
                    }
                }
                else {
                    ConsoleUtils.printMessage("Nenhum drone encontrado");
                }

            }
        });

        List<MenuOption> options = new ArrayList<MenuOption>();
        options.add(opt1);
        ConsoleUtils.showAndSelectMenu(options,"Gestão de modelos de drone");

    }

}
