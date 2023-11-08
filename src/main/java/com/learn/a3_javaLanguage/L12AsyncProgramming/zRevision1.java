package com.learn.a3_javaLanguage.L12AsyncProgramming;

import com.learn.utilities.MultiThreadUtility;

import java.util.concurrent.CompletableFuture;

public class zRevision1 {
    public static void main(String[] args) {

        System.out.println("Main1: " + Thread.currentThread());
        stringCompletableFuture("This is a text")
                .thenApply(String::length)
                .thenAccept(System.out::println);

        System.out.println("Main2: " + Thread.currentThread());

    }

    private static CompletableFuture<String> stringCompletableFuture(String text){

        CompletableFuture<String> stringCompletableFuture =
                CompletableFuture.supplyAsync(() -> strMethod(text));

        MultiThreadUtility.delay(6000);
        return stringCompletableFuture;
    }

    public static String strMethod(String text){
        System.out.println("From Str Method :: " + Thread.currentThread());
        return text.toUpperCase();
    }
}
