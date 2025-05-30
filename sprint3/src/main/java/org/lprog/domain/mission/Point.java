package org.lprog.domain.mission;

public class Point {
    public int latitude;
    public int longitude;
    public int altitude;

    public Point(int latitude, int longitude, int altitude) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.altitude = altitude;
    }

    public int getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    public int getLongitude() {
        return longitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

    public int getAltitude() {
        return altitude;
    }

    @Override
    public String toString() {
        return "(" + latitude + ", " + longitude + ", " + altitude + ")";
    }
}
