package com.foodtruckfinder.model;

import com.opencsv.bean.CsvBindByName;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
public class FoodTruck {
    public FoodTruck() {
    }

    @CsvBindByName
    private int locationid;

    @CsvBindByName
    private String Applicant;

    @CsvBindByName
    private String FacilityType;

    @CsvBindByName
    private String LocationDescription;

    @CsvBindByName
    private String Address;

    @CsvBindByName
    private String lot;

    @CsvBindByName
    private String permit;

    @CsvBindByName
    private String Status;

    @CsvBindByName
    private String FoodItems;

    @CsvBindByName
    private Double Latitude;

    @CsvBindByName
    private Double Longitude;

    @CsvBindByName
    private String Schedule;

    @CsvBindByName
    private String dayshours;

    public FoodTruck(int loctionid, String applicant, String facilitytype, String locationDescription, String address, String status,
            String foodItems, Double latitude, Double longitude, String permit, String schedule, String lot, String dayshours){
        this.locationid = loctionid;
        this.Applicant = applicant;
        this.FacilityType = facilitytype;
        this.LocationDescription = locationDescription;
        this.Address = address;
        this.Status = status;
        this.FoodItems = foodItems;
        this.Latitude = latitude;
        this.Longitude = longitude;
        this.permit = permit;
        this.Schedule = schedule;
        this.lot = lot;
        this.dayshours = dayshours;
    }
    public int getLocationid() {
        return locationid;
    }

    public void setLocationid(int locationid) {
        this.locationid = locationid;
    }

    public String getApplicant() {
        return Applicant;
    }

    public void setApplicant(String applicant) {
        Applicant = applicant;
    }

    public String getFacilityType() {
        return FacilityType;
    }

    public void setFacilityType(String facilityType) {
        FacilityType = facilityType;
    }

    public String getLocationDescription() {
        return LocationDescription;
    }

    public void setLocationDescription(String locationDescription) {
        LocationDescription = locationDescription;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getLot() {
        return lot;
    }

    public void setLot(String lot) {
        this.lot = lot;
    }

    public String getPermit() {
        return permit;
    }

    public void setPermit(String permit) {
        this.permit = permit;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getFoodItems() {
        return FoodItems;
    }

    public void setFoodItems(String foodItems) {
        FoodItems = foodItems;
    }

    public Double getLatitude() {
        return Latitude;
    }

    public void setLatitude(Double latitude) {
        Latitude = latitude;
    }

    public Double getLongitude() {
        return Longitude;
    }

    public void setLongitude(Double longitude) {
        Longitude = longitude;
    }

    public String getSchedule() {
        return Schedule;
    }

    public void setSchedule(String schedule) {
        Schedule = schedule;
    }

    public String getDayshours() {
        return dayshours;
    }

    public void setDayshours(String dayshours) {
        this.dayshours = dayshours;
    }

}
