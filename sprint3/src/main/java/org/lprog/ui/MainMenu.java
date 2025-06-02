package org.lprog.ui;

import org.lprog.ui.model.ModelUI;
import org.lprog.ui.utils.ConsoleColors;
import org.lprog.ui.utils.ConsoleUtils;
import org.lprog.ui.utils.MenuOption;

import java.util.ArrayList;
import java.util.List;

public class MainMenu implements Runnable {

    @Override
    public void run() {
        ConsoleUtils.printMessage("Gestor de frotas de drones - PORTUS");

        List<MenuOption> options = new ArrayList<MenuOption>();
        options.add(new MenuOption("Gestao de Modelos de Drone", new ModelUI()));

        ConsoleUtils.showAndSelectMenu(options, "Main Menu");
    }

}
