package org.lprog.repo.model;

import org.lprog.domain.model.Model;
import org.lprog.repo.Repo;
import org.lprog.ui.utils.ConsoleUtils.ConsoleUtils;

import java.util.List;

public class ModelRepo extends Repo<Model> {

    public ModelRepo() {
        super();
    }

    public void add(Model model) {

        List<Model> modelWithSameName = this.repoList.stream().filter(model1 -> model1.ModelName.equals(model.ModelName)).toList();
        if (modelWithSameName.isEmpty()) {
            ConsoleUtils.printMessage("Model Added: " + model);
            this.repoList.add(model);
        }
        else {
            ConsoleUtils.printError("There is a model called " + model.ModelName + " already");
        }

    }

    /**
     *
     * @param modelName
     * @return Model or Null if not found
     */
    public Model findByModelName(String modelName) {
        return this.repoList.stream().filter(model -> model.ModelName.equals(modelName)).findFirst().orElse(null);
    }

}
