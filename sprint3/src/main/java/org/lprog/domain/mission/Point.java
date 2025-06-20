package org.lprog.domain.mission;

public class Point {
    public double latitude;
    public double longitude;
    public double altitude;

    public Point(double latitude, double longitude, double altitude) {
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

    public double getAltitude() {
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

    public static double distance3D(Point a, Point b) {
        double earthRadius = 6371e3; // Raio médio da Terra em metros

        // Converter latitude e longitude para radianos
        double lat1 = Math.toRadians(a.latitude);
        double lon1 = Math.toRadians(a.longitude);
        double lat2 = Math.toRadians(b.latitude);
        double lon2 = Math.toRadians(b.longitude);

        // Altitude total (considerando raio da Terra)
        double r1 = earthRadius + a.altitude;
        double r2 = earthRadius + b.altitude;

        // Converter para coordenadas cartesianas
        double x1 = r1 * Math.cos(lat1) * Math.cos(lon1);
        double y1 = r1 * Math.cos(lat1) * Math.sin(lon1);
        double z1 = r1 * Math.sin(lat1);

        double x2 = r2 * Math.cos(lat2) * Math.cos(lon2);
        double y2 = r2 * Math.cos(lat2) * Math.sin(lon2);
        double z2 = r2 * Math.sin(lat2);

        // Distância euclidiana
        return Math.sqrt(
                Math.pow(x2 - x1, 2) +
                        Math.pow(y2 - y1, 2) +
                        Math.pow(z2 - z1, 2)
        );
    }

}