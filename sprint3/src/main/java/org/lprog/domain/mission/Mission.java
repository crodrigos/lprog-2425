package org.lprog.domain.mission;

import org.lprog.App;
import org.lprog.domain.drone.Drone;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Mission {

    private static int idCounter = 0;

    public int id;
    public Date startDate;
    public String modelName;
    public Drone drone;
    public Point startingPoint;
    public List<Point> deliveries;

    public Mission(String startDate, String modelName, Point startingPoint, List<Point> deliveries) {
        this.id = idCounter + 1;
        this.startDate = parseCustomDate(startDate);
        this.modelName = modelName;
        this.startingPoint = startingPoint;
        this.deliveries = deliveries;
    }

    public Mission(String startDate, Point startingPoint) {
        this.id = idCounter + 1;
        this.startDate = parseCustomDate(startDate);
        this.startingPoint = startingPoint;
        this.deliveries = new java.util.ArrayList<>();
    }

    public void addPoint (Point point) {
        deliveries.add(point);
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

    public void setModel(String modelName) {
        this.modelName = modelName;
    }

    public void setDrone(Drone drone) {
        this.drone = drone;
    }

    public int getId() {
        return id;
    }

    public double getTotalDistance() {
        double totalDistance = 0.0;
        Point lastPoint = startingPoint;

        for (Point delivery : deliveries) {
            totalDistance += lastPoint.distanceTo(delivery);
            lastPoint = delivery;
        }

        totalDistance += lastPoint.distanceTo(startingPoint);

        return totalDistance;
    }

    public String estimateMissionTotalTime () {
        return null;
    }

    public static Date parseCustomDate(String input) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd,HH:mm");
        try {
            return formatter.parse(input);
        } catch (ParseException e) {
            System.err.println("Formato inválido: " + input);
            return null;
        }
    }

    @Override
    public String toString() {
        return "\nMission {" +
                "\n  ID: " + id +
                "\n  Starting Date: " + startDate +
                "\n  Model: " + (modelName != null ? modelName : "No model assigned") +
                "\n  Drone: " + (drone != null ? drone.serialNumber : "No drone assigned") +
                "\n  Starting Point: " + startingPoint +
                "\n  Deliveries: [" + deliveries + "]" +
                "\n}";
    }
}
