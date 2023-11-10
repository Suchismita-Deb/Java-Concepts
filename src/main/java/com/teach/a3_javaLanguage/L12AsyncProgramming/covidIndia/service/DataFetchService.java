package com.teach.a3_javaLanguage.L12AsyncProgramming.covidIndia.service;



import com.teach.utilities.RestGETReadUtility;
import com.teach.utilities.entity.CovidIndia;
import com.teach.utilities.entity.Vehicle;
import com.teach.utilities.entity.dto.VehicleTransformed;
import com.teach.utilities.MultiThreadUtility;

import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CompletableFuture;


public class DataFetchService {

    public List<CovidIndia> fetchCovidIndiaData(){
        return RestGETReadUtility.covidReader();
    }

    public List<Vehicle> fetchVehicles(){
        return RestGETReadUtility.getRandomVehicles();
    }

    public String firstNameService(){
        MultiThreadUtility.delay(1000);//simulating task completion latency
        MultiThreadUtility.logMessage("From firstNameService");
        //int i = 1 / 0;
        return "john";
    }

    public String lastNameService(){
        MultiThreadUtility.delay(1000);
        MultiThreadUtility.logMessage("From lastNameService");
        return "doe";
    }

    public String greetingsService(){
        //MultiThreadUtility.delay(1000);
        MultiThreadUtility.logMessage("From Hello!!");
        return "Hello!!";
    }

    public CompletableFuture<VehicleTransformed> findVehicleWithGreatMileage(List<VehicleTransformed> vehicleList){
        MultiThreadUtility.logMessage("From composeVehicleData");
        //Returning the vehicle with maximum mileage
        return CompletableFuture.supplyAsync(() -> vehicleList.stream()
                .sorted(Comparator.comparing(VehicleTransformed::getMileage).reversed())
                .findFirst().get());
    }

    public CompletableFuture<String> futureName(String name){
        return CompletableFuture.supplyAsync(() -> {
            MultiThreadUtility.delay(1000);
            return ("Hello " + name );
        });
    }
}
