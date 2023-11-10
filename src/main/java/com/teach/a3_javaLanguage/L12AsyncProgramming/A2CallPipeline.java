package com.teach.a3_javaLanguage.L12AsyncProgramming;

import com.teach.utilities.InternetUtilities;
import com.teach.utilities.MultiThreadUtility;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class A2CallPipeline {
    public static void main(String[] args) {
        //intro();
        intro2();
    }

    private static void intro2() {
        CompletableFuture<List<String>> future = new CompletableFuture<>();

        future
                .thenApply(data -> data.stream().limit(10).collect(Collectors.toList()))
                .thenApply(data -> {
                    return data.stream()
                            .map(word -> getTransformedString(word))
                            .collect(Collectors.toList());

                })
                .thenAccept(data -> data.forEach(str -> System.out.println("Word is :: " + str)));

        System.out.println("Pipeline is built....");

        MultiThreadUtility.delay(3000);
        future.complete(InternetUtilities.bringWordListFromNet());//Evaluates lazily. The pipeline executes from this point on

        System.out.println("Post Future");
    }

    private static String getTransformedString(String word) {
        MultiThreadUtility.delay(100);
        //int i = 1/0; For Reject state
        return word.toUpperCase();
    }

    private static void intro() {
        CompletableFuture<Integer> future = new CompletableFuture<>();

        future
                .thenApply(data -> (2/data)*2)
                .exceptionally(throwable -> {
                    System.out.println(throwable.getMessage());
                    return 9;
                })
                .thenApply(data -> data+1)
                .thenAccept(data -> System.out.println("Result from Future " + data))
                .thenRun(()-> System.out.println("Process Completed!!"));

        System.out.println("Pipeline is built....");

        MultiThreadUtility.delay(4000);
        future.complete(0);//Evaluates lazily. The pipeline executes from this point on
    }
}
