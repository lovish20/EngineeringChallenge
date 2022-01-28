package com.foodtruckfinder.controller;

import java.util.List;

import com.foodtruckfinder.implementation.DataFilter;
import com.foodtruckfinder.model.FoodTruck;
import com.foodtruckfinder.model.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/foodtruck")
public class FoodTruckController {
    @Autowired
    DataFilter dataFilter;

    @PostMapping("/search")
    public List<FoodTruck> FoodTruckFinderByLocation(@RequestBody Location location) throws Exception{
        return dataFilter.GetFoodTrucksByLocation(location);
    }
}
