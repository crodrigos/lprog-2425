package org.lprog.repo.model;

import org.lprog.domain.model.Model;
import org.lprog.repo.IRepo;

import java.util.List;

public class ModelRepo implements IRepo<Model> {

    private List<Model> models;

    @Override
    public void add(Model obj) {
        models.add(obj);
    }

    @Override
    public void remove(Model obj) {
        models.remove(obj);
    }

    @Override
    public List<Model> getList() {
        return models;
    }
}
