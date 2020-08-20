This project is sample Food Delivery App use case using Spring Boot for Altimetrik Assignment


As of now I implemented only create food option, in future will add all the methods as required by assignment

Before doing all below steps just open Mysql console and create databse as : altimetrik_delivery_app ascmentioned in application.properties file using below command:
mysql>create database altimetrik_delivery_app;

Now follow below steps:

STEP 1.run the spring-boot app

STEP 2. Go to Post Man and select Post Method and paste below url to test food-controller method createFood
http://localhost:8080/food-boot/foods

STEP 3. In post man select Body, select raw, select JSON(application/json): 

STEP 4. Put below contents under body 

{
  "foodCategory": "veg",
  "foodName": "paneer",
  "foodPrice": 100
}

STEP 5. Hit send but, you will receive below response with Status as 200 OK

<FoodDetailsResponse>
    <foodId>9N3vmnZ8zB6g1N2ElLI13RZPTC7o6t</foodId>
    <foodName>paneer</foodName>
    <foodPrice>100.0</foodPrice>
    <foodCategory>veg</foodCategory>
</FoodDetailsResponse>