package org.lprog.repo.drone;

import org.lprog.domain.drone.Drone;
import org.lprog.repo.IRepo;

import java.util.ArrayList;
import java.util.List;

public class DroneRepo implements IRepo<Drone> {

    private final List<Drone> drones = new ArrayList<>();

    public DroneRepo() {}

    @Override
    public void add(Drone obj) {
        drones.add(obj);
    }

    @Override
    public void remove(Drone obj) {
        drones.remove(obj);
    }

    @Override
    public List<Drone> getList() {
        return drones;
    }
}