package org.lprog.domain.mission;

import org.lprog.domain.drone.Drone;

import java.util.Date;
import java.util.List;

public class Mission {

    public int id;
    public Date startDate;
    public Drone drone;
    public Point StartingPoint;
    public List<Point> deliveries;

    public Mission(int id, Date startDate, Drone drone, Point startingPoint, List<Point> deliveries) {
        this.id = id;
        this.startDate = startDate;
        this.drone = drone;
        this.StartingPoint = startingPoint;
        this.deliveries = deliveries;
    }

    public Mission(int id, Date startDate, Point startingPoint) {
        this.id = id;
        this.startDate = startDate;
        this.StartingPoint = startingPoint;
        this.deliveries = new java.util.ArrayList<>();
    }

    public void addPoint (Point point) {
        deliveries.add(point);
        System.out.println("Point " +
                point.toString() + "added.");
    }

    public void addPoint (String pointString) {
        String[] coords = pointString.split(",");
        Point point = new Point(
                Integer.parseInt(coords[0]),
                Integer.parseInt(coords[1]),
                Integer.parseInt(coords[2])
        );
        addPoint(point);
    }

    public void setDrone(Drone drone) {
        this.drone = drone;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Mission {" +
                "  ID: " + id +
                "  Starting Date: " + startDate +
                "  Drone: " + drone.serialNumber +
                "  Starting Point: " + StartingPoint +
                "  Deliveries: {" + deliveries + "}" +
                "}";
    }
}
