package org.lprog.domain.model;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Sensor {

    public static Sensor GPS = new Sensor("Global Positioning System", "GPS");
    public static Sensor CAMERA = new Sensor("CAMERA", "CAM");

    public String name;
    public String shrt;

    private Sensor(String name, String shrt) {
        this.name = name;
        this.shrt = shrt;
    }

    public static List<Sensor> getAllSensors() {
        List<Sensor> sensors = new ArrayList<>();
        Field[] fields = Sensor.class.getDeclaredFields();
        for (Field field : fields) {
            if (field.getType() == Sensor.class) {
                try {
                    sensors.add((Sensor) field.get(null));
                } catch (IllegalAccessException e) {
                    // Handle the exception as needed
                    e.printStackTrace();
                }
            }
        }
        return sensors;
    }
}
