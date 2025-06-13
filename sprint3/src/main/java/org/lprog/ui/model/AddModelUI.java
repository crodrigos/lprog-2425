package org.lprog.ui.model;

import org.lprog.domain.model.Model;
import org.lprog.grammar.model.ModelVisitorImpl;
import org.lprog.ui.utils.ConsoleUtils.ConsoleUtils;
import org.lprog.ui.utils.ConsoleUtils.MenuOption;
import org.lprog.ui.utils.FileDialog;

import java.util.List;
import java.util.ArrayList;
import javax.swing.*;
import java.io.File;

public class AddModelUI implements Runnable{

    Runnable fromFile = new Runnable() {
        @Override
        public void run() {
            JFileChooser fileChooser = new JFileChooser();

            var file = new FileDialog().getFile();
            if (file==null) {
                ConsoleUtils.printError("File not selected");
            }
            else {
                ConsoleUtils.printMessage("Selected file: " + file.getAbsolutePath());
            }
        }
    };

    public void run() {
        List<MenuOption> options = new ArrayList<>();
        options.add(new MenuOption("Apartir de ficheiro", fromFile));

        ConsoleUtils.showAndSelectMenu(options,  "Criar novo Modelo de Drone");
    }

}
