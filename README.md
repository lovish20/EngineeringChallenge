# EngineeringChallenge
Food Truck Engineering Challenge
The Problem
Our San Francisco team loves to eat. They are also a team that loves variety, so they also like to discover new places to eat.
In fact, we have a particular affection for food trucks. One of the great things about Food Trucks in San Francisco is that the city releases a list of them as open data.

Your assignment is to make it possible for us to find a food truck no matter where our work takes us in the city.

This is a freeform assignment. You can write a web API that returns a set of food trucks (our team is fluent in JSON). You can write a web frontend that visualizes the nearby food trucks. We also spend a lot of time in the shell, so a CLI that gives us a couple of local options would be great. And don't be constrained by these ideas if you have a better one!

The only requirement for the assignment is that it give us at least 5 food trucks to choose from a particular latitude and longitude.

Feel free to tackle this problem in a way that demonstrates your expertise of an area -- or takes you out of your comfort zone. For example, if you build Web APIs by day and want to build a frontend to the problem or a completely different language instead, by all means go for it - learning is a core competency in our group. Let us know this context in your solution's documentation.

San Francisco's food truck open dataset is located here and there is an endpoint with a CSV dump of the latest data here. We've included a copy of this data in this repo as well.

Good luck! Please send a link to your solution on Github back to us at least 12 hours before your interview so we can review it before we speak.


# Food Truck Data Based on San Francisco Government's Data Set that was provided as a CSV file
This is a Java spring Boot  Rest API and command line application which dispalys the food trucks based on the users latitude and longitude. The data can be accessed using sample postman or will be displayed on the command line.

# Pre-requisites for executing the application
The first and most important requirement is that there should be Java 1.7 or later installed on your machine.
Also Maven is used for compiling the application

# Executing the application using API

- Clone the repository into your local machine.

- Run Engineering Challenge Application using Intellij or Similar IDE so the service running
- Navigate to the following Search API to get list of Food Trucks 
- 

- HTTP Request
```http request
POST /v1/foodtruck/search HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Content-Length: 56

{
"latitude" : 37.887,
"longitude" : -122.3345
}
```
- CURL Request
```http request
  curl --location --request POST 'http://localhost:8080/v1/foodtruck/search' \
  --header 'Content-Type: application/json' \
  --data-raw '{
  "latitude" : 37.887,
  "longitude" : -122.3345
  }'
```

# Executing the application using CommandLine / Terminal


- Open the terminal/command prompt and navigate to the classFiles directory in the TakeHomeTest folder using the command:
    - For Mac: cd TakeHomeTest/classFiles
    - For Windows: cd TakeHomeTest\classFiles

    - To run the program execute the following commands given below:
        - For Mac:
            ```
            mvn clean install
            java -cp target/FoodTruckFinder-0.0.1-SNAPSHOT.jar com.foodtruckfinder.Main
            
        - For Windows:
           ```
            mvn clean install
            java -cp target\FoodTruckFinder-0.0.1-SNAPSHOT.jar com.foodtruckfinder.Main
           ```

- 
