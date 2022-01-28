package com.foodtruckfinder;

import com.foodtruckfinder.utils.FoodTruckCache;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
public class EngineeringChallengeApplication {

    public static void main(String[] args) {
        SpringApplication.run(EngineeringChallengeApplication.class, args);
        FoodTruckCache.loadCache();
    }



}
