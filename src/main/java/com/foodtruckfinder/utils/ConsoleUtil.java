package com.foodtruckfinder.utils;

import java.util.List;

import com.foodtruckfinder.model.FoodTruck;

public class ConsoleUtil {

    //Print the details of food trucks
    public void printFoodTruckDetails(List<FoodTruck>foodTruckList, String specifiers){
        foodTruckList.forEach(foodTruck -> System.out.format(specifiers, foodTruck.getApplicant(), foodTruck.getAddress()));
    }
}
