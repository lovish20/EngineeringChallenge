package com.foodtruckfinder.controller;

import java.util.List;

import com.foodtruckfinder.implementation.DataFilter;
import com.foodtruckfinder.model.FoodTruck;
import com.foodtruckfinder.model.Location;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/foodtruck")
public class FoodTruckController {
    private static final Logger logger = LogManager.getLogger(FoodTruckController.class);

    @Autowired
    DataFilter dataFilter;

    @PostMapping("/search")
    public List<FoodTruck> FoodTruckFinderByLocation(@RequestBody Location location) {
        try {
            return dataFilter.GetFoodTrucksByLocation(location);
        } catch (Exception e) {
            logger.error(e);
        }
        return null;
    }
}
