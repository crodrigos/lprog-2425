package org.lprog.domain.mission;

import org.lprog.domain.model.Model;

import java.util.Date;
import java.util.List;

public class Mission {

    public Date startDate;
    public Model model;
    public Point StartingPoint;
    public List<Point> deliveries;

    public Mission(Date startDate, Model model, Point startingPoint, List<Point> deliveries) {
        this.startDate = startDate;
        this.model = model;
        this.StartingPoint = startingPoint;
        this.deliveries = deliveries;
    }

    public Mission(Date startDate, Point startingPoint) {
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

    public void setModel(Model model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Mission {" +
                "  Starting Date: " + startDate +
                "  Model: " + model.ModelName +
                "  Starting Point: " + StartingPoint +
                "  Deliveries: {" + deliveries + "}" +
                "}";
    }
}
