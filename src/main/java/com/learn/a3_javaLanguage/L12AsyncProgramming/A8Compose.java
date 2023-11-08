package com.learn.a3_javaLanguage.L12AsyncProgramming;

import com.learn.utilities.MultiThreadUtility;
import com.learn.utilities.PerformanceUtility;

import java.util.concurrent.CompletableFuture;

public class A8Compose {
    public static void main(String[] args) {

        //likeSequential();

        CompletableFuture<Double> radiusFuture = CompletableFuture.supplyAsync(() -> getRadius());
        //CompletableFuture<Double> areaFuture = CompletableFuture.supplyAsync(() -> getArea(radius));

        PerformanceUtility.startTimer();
        CompletableFuture<Void> voidCompletableFuture = radiusFuture
                .thenCompose(radius -> CompletableFuture.supplyAsync(() -> getArea(radius)))
                .thenAccept(area -> System.out.println(area));
        PerformanceUtility.stopTimer();


        PerformanceUtility.resetTimer();
        PerformanceUtility.startTimer();
        System.out.println(voidCompletableFuture.join());
        PerformanceUtility.stopTimer();
        //delay(3000);

    }

    private static void likeSequential() {
        PerformanceUtility.startTimer();
        CompletableFuture<Double> radiusFuture = CompletableFuture.supplyAsync(() -> getRadius());

        Double radius = radiusFuture.join();
        CompletableFuture<Double> areaFuture = CompletableFuture.supplyAsync(() -> getArea(radius));

        Double area = areaFuture.join();
        PerformanceUtility.stopTimer();

        PerformanceUtility.resetTimer();
        System.out.println(area);
    }

    public static Double getArea(Double radius){
        MultiThreadUtility.delay(1000);
        return Math.PI * radius * radius;
    }
    public static Double getRadius(){
        MultiThreadUtility.delay(1000);
        //return null;
        return 2.0;
    }
}
