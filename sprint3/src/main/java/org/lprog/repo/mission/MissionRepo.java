package org.lprog.repo.mission;

import org.lprog.domain.mission.Mission;
import org.lprog.repo.IRepo;

import java.util.List;

public class MissionRepo implements IRepo<Mission> {

    private List<Mission> missions;

    @Override
    public void add(Mission obj) {
        missions.add(obj);
    }

    @Override
    public void remove(Mission obj) {
        missions.remove(obj);
    }

    @Override
    public List<Mission> getList() {
        return missions;
    }
}