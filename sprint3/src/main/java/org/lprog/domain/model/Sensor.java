package org.lprog.domain.model;

public class Sensor {

    public static Sensor GPS = new Sensor("Global Positioning System", "GPS");
    public static Sensor CAMERA = new Sensor("CAMERA", "CAM");

    public String name;
    public String shrt;

    private Sensor(String name, String shrt) {
        this.name = name;
        this.shrt = shrt;
    }
}
