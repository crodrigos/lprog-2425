package org.lprog.repo.model;

import org.lprog.domain.mission.Mission;
import org.lprog.repo.IRepo;

import java.util.ArrayList;
import java.util.List;

public class MissionRepo implements IRepo<Mission> {

    private final List<Mission> missions = new ArrayList<>();

    public MissionRepo() {}

    @Override
    public void add(Mission obj) {
        missions.add(obj);
        System.out.println("Mission added: " + obj.toString());
    }

    @Override
    public void remove(Mission obj) {
        if (missions.remove(obj)) {
            System.out.println("Mission removed: " + obj.toString());
        } else {
            System.out.println("Mission not found: " + obj.toString());
        }
    }

    @Override
    public List<Mission> getList() {
        return missions;
    }
}
