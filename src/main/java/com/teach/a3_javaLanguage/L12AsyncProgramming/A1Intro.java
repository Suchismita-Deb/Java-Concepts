package com.teach.a3_javaLanguage.L12AsyncProgramming;

import java.text.DecimalFormat;
import java.util.concurrent.CompletableFuture;

public class A1Intro {
    public static void main(String[] args) {
        CompletableFuture<Double> completableFuture = getData();

       //completableFuture.thenAccept(x -> System.out.println(x));

        //If there is an exception, the future will go into REJECT state
        completableFuture
                //.thenApply(x ->  x.intValue() )
                .thenApply(x -> 2/x)
                .thenApply(y -> new DecimalFormat("0.00").format(y))
                .thenAccept(x -> System.out.println("formatted Value = " + x))//Behaves like ForEach, but not a
                // reduction
                // operation.
                .thenAccept(x -> System.out.println(x))
                .thenRun(() -> System.out.println("Can continue"))
                .thenRun(() -> System.out.println("Even further"))
                ;
    }

    private static CompletableFuture<Double> getData(){
        return CompletableFuture.supplyAsync( () -> Math.PI);
    }
}
