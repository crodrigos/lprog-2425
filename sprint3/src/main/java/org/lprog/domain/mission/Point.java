package org.lprog.domain.mission;

public class Point {
    public double latitude;
    public double longitude;
    public int altitude;

    public Point(double latitude, double longitude, int altitude) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.altitude = altitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    @Override
    public String toString() {
        return "(" + latitude + ", " + longitude + ", " + altitude + ")";
    }

    public double distanceTo(Point point) {
        double latDiff = Math.toRadians(point.latitude - this.latitude);
        double lonDiff = Math.toRadians(point.longitude - this.longitude);
        double altDiff = point.altitude - this.altitude;

        double a = Math.pow(Math.sin(latDiff / 2), 2) +
                Math.cos(Math.toRadians(this.latitude)) * Math.cos(Math.toRadians(point.latitude)) *
                Math.pow(Math.sin(lonDiff / 2), 2);

        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        double horizontalDistance = 6371e3 * c; // Earth radius in meters
        return Math.sqrt(horizontalDistance * horizontalDistance + altDiff * altDiff);
    }
}