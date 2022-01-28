package com.foodtruckfinder.utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.foodtruckfinder.implementation.DataLoader;
import com.foodtruckfinder.model.FoodTruck;

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
    public static FoodTruckCache loadCache() throws IOException {
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
    public void loadCacheData() throws IOException {
        instance.foodTruckData = (new DataLoader().GetFoodTruckDataFromFile(Constants.CSV_FILE_PATH));
    }
}
