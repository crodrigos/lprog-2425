package org.lprog.ui.model;

import org.lprog.App;
import org.lprog.domain.model.Model;
import org.lprog.grammar.model.ModelVisitorImpl;
import org.lprog.repo.model.ModelRepo;
import org.lprog.ui.utils.ConsoleUtils.ConsoleUtils;
import org.lprog.ui.utils.ConsoleUtils.MenuOption;
import org.lprog.ui.utils.FileDialog;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import javax.swing.*;

public class AddModelUI implements Runnable{

    Runnable fromFileJFileChooser = new Runnable() {
        @Override
        public void run() {
            JFileChooser fileChooser = new JFileChooser();

            var file = new FileDialog().getFile();
            if (file==null) {
                ConsoleUtils.printError("Nao foi selecionado ficheiro");
            }
            else {
                try {
                    List<Model> models = ModelVisitorImpl.GetModelFromFile(file.getAbsolutePath());
                    ModelRepo modelRepo = App.getInstance().Repos.modelRepo;
                    models.forEach((model) -> {modelRepo.add(model);});

                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    };

    Runnable fromFilepath = new Runnable() {
        @Override
        public void run() {

            FileDialog fileDialog = new FileDialog();
            File file = fileDialog.getFile();

            try {
                List<Model> models = ModelVisitorImpl.GetModelFromFile(file.getAbsolutePath());
                ModelRepo modelRepo = App.getInstance().Repos.modelRepo;
                models.forEach((model) -> {modelRepo.add(model);});

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    };

    public void run() {
        List<MenuOption> options = new ArrayList<>();
        options.add(new MenuOption("A partir de ficheiro", fromFilepath));

        ConsoleUtils.showAndSelectMenu(options,  "Criar novo Modelo de Drone");
    }

}
