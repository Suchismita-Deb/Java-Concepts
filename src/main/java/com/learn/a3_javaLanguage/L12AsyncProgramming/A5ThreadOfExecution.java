package com.learn.a3_javaLanguage.L12AsyncProgramming;

import com.learn.a3_javaLanguage.L12AsyncProgramming.covidIndia.service.DataFetchService;
import com.learn.utilities.PerformanceUtility;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class A5ThreadOfExecution {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        DataFetchService dataFetchService = new DataFetchService();
        System.out.println(Thread.currentThread() + " :: main");

        //Takes total time equal to sum total of individual method times
        //total time = method1 + method2 + method3
        //sequentialProgramRunningInOneThread(dataFetchService);

        //Takes time based on the slowest method. total time = Max(method1, method2, method3) + tiny extra processing time
        asyncRun(dataFetchService);

    }

    private static void asyncRun(DataFetchService dataFetchService) throws InterruptedException, ExecutionException {
        PerformanceUtility.startTimer();
        // May run in the main thread if all the executions are done,
        // or it may run in a different thread
        CompletableFuture<String> helloFuture = CompletableFuture.supplyAsync(()-> dataFetchService.greetingsService());
        //delay(2000);
        CompletableFuture<String> firstNameFuture = CompletableFuture.supplyAsync(()-> dataFetchService.firstNameService());
        CompletableFuture<String> lastNameFuture = CompletableFuture.supplyAsync(()-> dataFetchService.lastNameService());
        PerformanceUtility.stopTimer();//Shows the time of pipeline Creation - NOT EXECUTION

        PerformanceUtility.resetTimer();

        PerformanceUtility.startTimer();//Actual call to the pipeline
        System.out.println(helloFuture.join()  + " "+  firstNameFuture.join() + " "+ lastNameFuture.join());//Prefer
        // join instead of GET
        PerformanceUtility.stopTimer();
    }

    private static void sequentialProgramRunningInOneThread(DataFetchService dataFetchService) {
        //Example service, could be a DB Call or a REST Call to outside Service or anyService Call (KafkaQueue, other messaging Queue)
        PerformanceUtility.startTimer();
        String hello = dataFetchService.greetingsService();
        String firstName = dataFetchService.firstNameService();
        String lastName = dataFetchService.lastNameService();
        PerformanceUtility.stopTimer();

        System.out.println(hello  + " "+  firstName + " "+ lastName);
        PerformanceUtility.resetTimer();
    }
}
