package com.foodtruckfinder.implementation;

import static org.junit.jupiter.api.Assertions.*;

import com.foodtruckfinder.exception.ParametersOutOfBoundsException;
import com.foodtruckfinder.model.Location;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class DataFilterTest {

    private static DataFilter dataFilter;
    private static Location location;

    @Test
    public void getFoodTrucksByLocationWithValidArguments() throws Exception {
        location.setLatitude(37.883);
        location.setLongitude(-122.3345);

        assertEquals(47, dataFilter.GetFoodTrucksByLocation(location).size());
    }

    @BeforeAll
    static void beforeAll() {
        dataFilter = new DataFilter();
        location = new Location();
    }

    @Test
    public void getFoodTrucksByLocationWithInvalidArguments() throws Exception {
        location.setLatitude(95);
        location.setLongitude(200);

        Throwable exception = assertThrows(ParametersOutOfBoundsException.class, () -> dataFilter.GetFoodTrucksByLocation(location));
        assertEquals("Parameters are out of bounds", exception.getMessage());
    }
}