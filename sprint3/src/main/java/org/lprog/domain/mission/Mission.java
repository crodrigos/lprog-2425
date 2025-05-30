package org.lprog.domain.mission;

import java.util.Date;
import java.util.List;

public class Mission {

    public Date startDate;
    public String Model;
    public Point StartingPoint;
    public List<Point> deliveries;

    public Mission(Date startDate, String model, Point startingPoint, List<Point> deliveries) {
        this.startDate = startDate;
        this.Model = model;
        this.StartingPoint = startingPoint;
        this.deliveries = deliveries;
    }

    public void addPoint (Point point) {
        deliveries.add(point);
        System.out.println("Point " +
                point.toString() + "added.");
    }
}
