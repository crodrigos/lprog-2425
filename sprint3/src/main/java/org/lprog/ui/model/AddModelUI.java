package org.lprog.ui.model;

import org.lprog.domain.model.Model;
import org.lprog.grammar.model.ModelVisitorImpl;
import org.lprog.ui.utils.ConsoleUtils;
import org.lprog.ui.utils.MenuOption;

import java.util.List;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.io.File;

public class AddModelUI implements Runnable{

    Runnable fromFile = new Runnable() {
        @Override
        public void run() {
            JFileChooser fileChooser = new JFileChooser();

            var dialogResp = fileChooser.showOpenDialog(fileChooser);

            if (dialogResp == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();

                try {
                    Model model = ModelVisitorImpl.GetModelFromFile(file.getAbsolutePath());
                } catch (Exception e) {
                    ConsoleUtils.printError(e.getMessage());
                }

            }
            else {
                ConsoleUtils.printError("Não foi selecionado um ficheiro");
            }
        }
    };

    public void run() {
        List<MenuOption> options = new ArrayList<>();
        options.add(new MenuOption("Apartir de ficheiro", fromFile));

        ConsoleUtils.showAndSelectMenu(options,  "Criar novo Modelo de Drone");
    }

}
