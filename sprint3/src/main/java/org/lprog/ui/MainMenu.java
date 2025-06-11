package org.lprog.ui;

import org.lprog.ui.mission.MissionUI;
import org.lprog.ui.model.ModelUI;
import org.lprog.ui.drone.DroneUI;
import org.lprog.ui.utils.ConsoleUtils;
import org.lprog.ui.utils.MenuOption;

import java.util.ArrayList;
import java.util.List;

public class MainMenu implements Runnable {

    @Override
    public void run() {
        ConsoleUtils.printMessage("Gestor de frotas de drones - PORTUS");

        List<MenuOption> options = new ArrayList<MenuOption>();
        options.add(new MenuOption("Gestao de Modelos de Drones", new ModelUI()));
        options.add(new MenuOption("Gestao de Frotas de Drones", new DroneUI()));
        options.add(new MenuOption("Gestão de Missões", new MissionUI()));

        ConsoleUtils.showAndSelectMenu(options, "Main Menu");
    }

}
