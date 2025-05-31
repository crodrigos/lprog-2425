package org.lprog.repo;

import org.lprog.repo.drone.DroneRepo;
import org.lprog.repo.model.MissionRepo;
import org.lprog.repo.model.ModelRepo;

public class RepoStore {

    public final ModelRepo modelRepo = new ModelRepo();
    public final MissionRepo missionRepo = new MissionRepo();
    public final DroneRepo droneRepo = new DroneRepo();

    public RepoStore() {}

}
