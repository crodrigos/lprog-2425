package org.lprog.bootstrap;

import org.lprog.App;
import org.lprog.domain.model.Model;
import org.lprog.domain.model.Sensor;
import org.lprog.ui.utils.ConsoleUtils;

import java.util.ArrayList;

public class RepoBootStrap implements Runnable{

    private void AddModels() {
        Model model1 = new Model(
                "FX-001",
                1000,
                90,
                30,
                20,
                25,
                new ArrayList<Sensor>(),
                new ArrayList<String>()
        );

        AddModel(model1);
    }

    private void AddModel(Model model) {
        App.getInstance().Repos.modelRepo.add(model);
    }

    @Override
    public void run() {
        ConsoleUtils.printMessage("\nAdding models");
        AddModels();
    }

}
