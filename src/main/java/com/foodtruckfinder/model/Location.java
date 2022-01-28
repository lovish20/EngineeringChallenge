package com.foodtruckfinder.model;
public class Location {
    /**
     * latitude of the search location in degrees (valid range [-90; 90]
     */
    private double latitude;

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    /**
     *  longitude of the search location in degrees (valid range [-180; 180]
     */
    private double longitude;

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
