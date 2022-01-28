package com.foodtruckfinder.implementation;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import com.foodtruckfinder.model.FoodTruck;
import com.opencsv.bean.CsvToBeanBuilder;

public class DataLoader {

    public List<FoodTruck> GetFoodTruckDataFromFile() {

        // parse csv to get list of food trucks
        List<FoodTruck> foodTruckList = null;
        try (Reader BufferedReader = Files.newBufferedReader(Path.of("src/main/resources/static/Mobile_Food_Facility_Permit.csv"), StandardCharsets.US_ASCII)) {

            // create csv bean reader
            foodTruckList = new CsvToBeanBuilder(BufferedReader)
                    .withType(FoodTruck.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build()
                    .parse();

        } catch (Exception ex) {
            String exception = ex.getMessage();
        }
        return foodTruckList;
    }
}



