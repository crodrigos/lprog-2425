package org.lprog.repo;

import java.util.ArrayList;
import java.util.List;

public abstract class Repo<T> {

    public final List<T> repoList;

    protected Repo() {
        this.repoList = new ArrayList<T>();
    }

    public void add(T obj) {
        this.repoList.add(obj);
    }

    public void remove(T obj) {
        this.repoList.remove(obj);
    }
}
