package com.foodtruckfinder.implementation;

import java.util.ArrayList;
import java.util.List;

import com.foodtruckfinder.controller.FoodTruckController;
import com.foodtruckfinder.exception.ParametersOutOfBoundsException;
import com.foodtruckfinder.model.FoodTruck;
import com.foodtruckfinder.model.Location;
import com.foodtruckfinder.utils.Constants;
import com.foodtruckfinder.utils.FoodTruckCache;
import com.javadocmd.simplelatlng.LatLng;
import com.javadocmd.simplelatlng.LatLngTool;
import com.javadocmd.simplelatlng.util.LengthUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class DataFilter {

    private static final Logger logger = LogManager.getLogger(DataFilter.class);

    public List<FoodTruck> GetFoodTrucksByLocation(Location location) throws Exception {
        double latitude = location.getLatitude();
        double longitude = location.getLongitude();
        LatLng currentLocation = new LatLng(latitude, longitude);

        // check bounds
        if(latitude < -90 || latitude > 90 || longitude < -180 || longitude > 180 ){
            logger.error("Parameters are out of bounds");
            throw new ParametersOutOfBoundsException("Parameters are out of bounds");
        }

        logger.info("Find trucks by location", longitude, latitude);

        List<FoodTruck> eligibleFoodTrucks = new ArrayList<>();

        for (FoodTruck foodtruck : FoodTruckCache.loadCache().getFoodTruckData()) {
            if (foodtruck.getLatitude() != null && foodtruck.getLongitude() != null) {
                LatLng ftLoc = new LatLng(foodtruck.getLatitude(), foodtruck.getLongitude());

                if (LatLngTool.distance(currentLocation, ftLoc, LengthUnit.MILE) <= Constants.BUFFER_DISTANCE) {

                    // Show only status = approved food trucks
                    if (foodtruck.getStatus().equals("APPROVED")) {
                        eligibleFoodTrucks.add(foodtruck);
                    }
                }
            }
        }
        return eligibleFoodTrucks;
    }
}
