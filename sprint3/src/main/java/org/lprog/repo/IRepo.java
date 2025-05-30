package org.lprog.repo;

import java.util.List;

public interface IRepo<T> {
    void add(T obj);
    void remove(T obj);
    List<T> getList();
}
