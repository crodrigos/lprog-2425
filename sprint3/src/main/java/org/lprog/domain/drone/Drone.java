package org.lprog.domain.drone;

import org.lprog.domain.model.Model;

import java.util.List;

public class Drone {

    public String serialNumber;
    public int flightTime;
    public Model model;
    public List<String> restrictions;
    public Status status;

    public Drone(
        String serialNumber,
        int flightTime,
        Model model,
        List<String> restrictions,
        Status status
    ) {
        this.serialNumber = serialNumber;
        this.flightTime = flightTime;
        this.model = model;
        this.restrictions = restrictions;
        this.status = status;
    }
}
