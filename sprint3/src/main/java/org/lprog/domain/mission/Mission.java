package org.lprog.domain.mission;

import org.lprog.App;
import org.lprog.domain.drone.Drone;
import org.lprog.domain.model.Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Mission {

    private static int idCounter = 0;

    public int id;
    public Date startDate;
    public String modelName;
    public Model model;
    public Drone drone;
    public Point startingPoint;
    public List<Point> deliveries;
    public Status status;


    public Mission(String startDate, String modelName, Point startingPoint, List<Point> deliveries) {
        this.id = idCounter + 1;
        this.startDate = parseCustomDate(startDate);
        this.modelName = modelName;
        this.startingPoint = startingPoint;
        this.deliveries = deliveries;
        this.status = Status.Pending;
    }

    public Mission(String startDate, Point startingPoint) {
        this.id = idCounter + 1;
        this.startDate = parseCustomDate(startDate);
        this.startingPoint = startingPoint;
        this.deliveries = new java.util.ArrayList<>();
        this.status = Status.Pending;
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

    public void setModel(Model model) {
        this.model = model;
    }

    public void setModelName (String modelName) {
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
            totalDistance += Point.distance3D(lastPoint, delivery);
            lastPoint = delivery;
        }

        totalDistance += lastPoint.distanceTo(startingPoint);

        return totalDistance;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return status;
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

    public double CalculateMissionLength() {
        if (deliveries == null || deliveries.size() < 2) {
            return 0.0;
        }

        double totalDistance = 0.0;

        for (int i = 0; i < deliveries.size() - 1; i++) {
            totalDistance += deliveries.get(i).distanceTo(deliveries.get(i + 1));
        }

        return totalDistance;
    }

    /**
     *
     * @return Mission duration in seconds
     */
    public double CalculateMissionDuration() {

        Model model = App.getInstance().Repos.modelRepo.findByModelName(modelName);

        if (model == null || startingPoint == null || deliveries == null || deliveries.isEmpty()) {
            return 0.0;
        }

        double totalTime = 0.0;

        // Velocidades em metros por segundo
        double cruisingVelocity = model.CruisingVelocity;
        double liftingVelocity = model.LiftingVelocity;
        double landingVelocity = model.LandingVelocity;

        Point current = startingPoint;

        for (Point destination : deliveries) {
            // 1. Fase de subida
            double verticalLift = Math.max(0, destination.altitude - current.altitude);
            totalTime += verticalLift / liftingVelocity;

            // 2. Fase de cruzeiro (distância horizontal em metros)
            double horizontalDistance = calculateHorizontalDistance(current, destination);
            totalTime += horizontalDistance / cruisingVelocity;

            // 3. Fase de descida
            double verticalDrop = Math.max(0, current.altitude - destination.altitude);
            totalTime += verticalDrop / landingVelocity;

            // Atualiza o ponto atual
            current = destination;
        }

        return totalTime; // tempo total em segundos
    }



    private double calculateHorizontalDistance(Point a, Point b) {
        double latDiff = Math.toRadians(b.latitude - a.latitude);
        double lonDiff = Math.toRadians(b.longitude - a.longitude);

        double earthRadius = 6371e3; // Raio da Terra em metros

        double h = Math.pow(Math.sin(latDiff / 2), 2) +
                Math.cos(Math.toRadians(a.latitude)) * Math.cos(Math.toRadians(b.latitude)) *
                        Math.pow(Math.sin(lonDiff / 2), 2);

        double c = 2 * Math.atan2(Math.sqrt(h), Math.sqrt(1 - h));

        return earthRadius * c; // distância horizontal em metros
    }



    @Override
    public String toString() {
        return "\nMission {" +
                "\n  ID: " + id +
                "\n  Starting Date: " + startDate +
                "\n  Model: " + (modelName != null ? modelName : "No model assigned") +
                "\n  Drone: " + (drone != null ? drone.serialNumber : "No drone assigned") +
                "\n  Starting Point: " + startingPoint +
                "\n  Status: " + status +
                "\n  Deliveries: [" + deliveries + "]" +
                "\n}";
    }
}
