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

    public void addPoint (Point point) {
        deliveries.add(point);
        System.out.println("Point " +
                point.toString() + "added.");
    }

    @Override
    public String toString() {
        return "Mission{" +
                "startDate=" + startDate +
                ", model=" + model.ModelName +
                ", StartingPoint=" + StartingPoint +
                ", deliveries=" + deliveries +
                '}';
    }
}
