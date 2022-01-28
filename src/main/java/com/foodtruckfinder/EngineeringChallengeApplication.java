package com.foodtruckfinder;

import java.io.IOException;

import com.foodtruckfinder.implementation.DataLoader;
import com.foodtruckfinder.utils.FoodTruckCache;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
public class EngineeringChallengeApplication {

    private static final Logger logger = LogManager.getLogger(EngineeringChallengeApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(EngineeringChallengeApplication.class, args);
        try {
            FoodTruckCache.loadCache();
        } catch (IOException e) {
            logger.error("Error Loading Food Truck Data from CSV file", e);
        }
    }



}
