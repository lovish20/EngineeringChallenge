package com.foodtruckfinder.utils;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.foodtruckfinder.implementation.DataLoader;
import com.foodtruckfinder.model.FoodTruck;
import org.springframework.stereotype.Component;

//@Component
public class FoodTruckCache {
    private static FoodTruckCache instance;

    public List<FoodTruck> getFoodTruckData() {
        return foodTruckData;
    }

    private List<FoodTruck> foodTruckData = new ArrayList<>();

    /**
     * Private constructor to prevent instantiation of the Cache Class
     */
    private FoodTruckCache() {}

    /**
     * Returns one single instance of the FoodTruck Cache throughout the span of the application
     */
    public static FoodTruckCache loadCache() {
        // To make the instance of the Cache thread safe
        synchronized (FoodTruckCache.class) {
            if (instance == null) {
                // Lazily initializing instance of Cache
                instance = new FoodTruckCache();
                instance.loadCacheData();
            }
        }
        return instance;
    }

    /**
     * This method is called to load cache data
     */
    public void loadCacheData() {
        instance.foodTruckData = (new DataLoader().GetFoodTruckDataFromFile());
    }

//    /**
//     * Populates the geo hash map
//     */
//    public void setGeoHashMap (Map<String,Integer> map) {
//        this.geoHashMap = map;
//    }
//
//    /**
//     * Returns the geo hash map
//     */
//    public Map<String,Integer> getGeoHashMap () {
//        return this.geoHashMap;
//    }
}
