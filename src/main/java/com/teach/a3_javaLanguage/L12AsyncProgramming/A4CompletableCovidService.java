package com.teach.a3_javaLanguage.L12AsyncProgramming;



import com.teach.a3_javaLanguage.L12AsyncProgramming.covidIndia.functions.DataTransformationFunctions;
import com.teach.a3_javaLanguage.L12AsyncProgramming.covidIndia.service.DataFetchService;
import com.teach.utilities.entity.CovidIndia;
import com.teach.utilities.entity.dto.CovidIndiaTransformed;
import com.teach.utilities.PerformanceUtility;

import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class A4CompletableCovidService {
    public static void main(String[] args) {

        DataFetchService dataFetchService = new DataFetchService();

        PerformanceUtility.startTimer();
        CompletableFuture<Void> future = CompletableFuture.supplyAsync(() -> dataFetchService.fetchCovidIndiaData())//returns the completable future of type entity
                .thenApply(covidIndiaList -> getCovidIndiaList(covidIndiaList)) //Applying function to each element of list
                .thenApply(covidIndiaList -> getCovidIndiaTransformedList(covidIndiaList))
                .thenAccept((covidIndiaTransformedList) -> {
                    covidIndiaTransformedList.forEach(x->{});
                });// .join()//waiting operation
        PerformanceUtility.stopTimer();//If join is not used, the operation continues and program reaches here, without actually download the data

        PerformanceUtility.resetTimer();
        PerformanceUtility.startTimer();
            future.join();//Running the pipeline
        PerformanceUtility.stopTimer();
        System.out.println("Completed!!");
    }

    private static List<CovidIndiaTransformed> getCovidIndiaTransformedList(List<CovidIndia> covidIndiaList) {
        return covidIndiaList.stream().map(DataTransformationFunctions.covidFunction).collect(Collectors.toList());
    }

    private static List<CovidIndia> getCovidIndiaList(List<CovidIndia> covidIndiaList) {
        return covidIndiaList
                .stream()
                .sorted(Comparator
                        .comparing(CovidIndia::getDeaths)
                        .reversed()
                        .thenComparing(CovidIndia::getActive))
                .collect(Collectors.toList());
    }
}
