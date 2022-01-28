package com.foodtruckfinder.implementation;

import static com.foodtruckfinder.utils.Constants.CSV_FILE_PATH;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import com.foodtruckfinder.exception.ParametersOutOfBoundsException;
import com.foodtruckfinder.utils.Constants;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DataLoaderTest {

    private DataLoader dataLoader;

    @BeforeEach
    void setUp() {
        dataLoader = new DataLoader();
    }

    @Test
    void getFoodTruckDataFromFileWithValidFilePath() throws IOException {
        assertEquals(597,dataLoader.GetFoodTruckDataFromFile(CSV_FILE_PATH).size());
    }

    @Test
    void getFoodTruckDataFromFileWithInvalidFilePath() throws IOException {
        Throwable exception = assertThrows(IOException.class, () -> dataLoader.GetFoodTruckDataFromFile("invalid_file.csv"));
        assertEquals("Error Loading Food Truck Data from CSV file", exception.getMessage());}

}