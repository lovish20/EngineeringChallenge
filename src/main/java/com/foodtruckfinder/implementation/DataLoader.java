package com.foodtruckfinder.implementation;


import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import com.foodtruckfinder.model.FoodTruck;
import com.foodtruckfinder.utils.Constants;
import com.opencsv.bean.CsvToBeanBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DataLoader {

    private static final Logger logger = LogManager.getLogger(DataLoader.class);

    public List<FoodTruck> GetFoodTruckDataFromFile(String csvFilePath) throws IOException {

        // parse csv to get list of food trucks
        List<FoodTruck> foodTruckList = null;
        try (Reader BufferedReader = Files.newBufferedReader(Path.of(csvFilePath), StandardCharsets.US_ASCII)) {

            // create csv bean reader
            foodTruckList = new CsvToBeanBuilder(BufferedReader)
                    .withType(FoodTruck.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build()
                    .parse();

        } catch (Exception ex) {
            throw new IOException("Error Loading Food Truck Data from CSV file", ex);
        }
        return foodTruckList;
    }
}



