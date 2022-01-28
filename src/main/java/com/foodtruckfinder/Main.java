package com.foodtruckfinder;

import java.util.List;

import com.foodtruckfinder.implementation.DataFilter;
import com.foodtruckfinder.model.FoodTruck;
import com.foodtruckfinder.model.Location;
import com.foodtruckfinder.utils.ConsoleUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        try {

            //Initializers
            Location location = new Location();
            location.setLatitude(37.887);
            location.setLongitude(-122.3345);
            DataFilter dataFilter = new DataFilter();
            List<FoodTruck> eligibleFoodTrucks = dataFilter.GetFoodTrucksByLocation(location);

            if (eligibleFoodTrucks.isEmpty()) {
                //When no food trucks are open show the message to user
                System.out.println("Sorry! No food trucks are open at this time.");
            } else {
                ConsoleUtil consoleUtil = new ConsoleUtil();
                System.out.println("The list of food trucks available near your location in San Francisco");
                System.out.println("----------------------------------------------------------------------------");
                String specifiers = "%-80s %-30s %n";
                System.out.format(specifiers, "NAME", "ADDRESS");

                consoleUtil.printFoodTruckDetails(eligibleFoodTrucks, specifiers);
            }

        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
    }
}