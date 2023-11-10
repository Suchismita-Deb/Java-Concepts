package com.teach.a3_javaLanguage.L12AsyncProgramming;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ForkJoinPool;

public class A6ChangingThreadPool {
    public static void main(String[] args) {

        ForkJoinPool pool = new ForkJoinPool(50);
        /* In Spring properties yml, more arguments to Constructor can be passed.
        spring:
          task:
            execution:
              pool:
                coreSize: 10
                maxSize: 400
                keepAlive: 60s
                allowCoreThreadTimeout: true
         */

        CompletableFuture<Double> future = CompletableFuture.supplyAsync(() -> getaDouble(), pool);

        double value = future.join();

        System.out.println(value);
    }

    private static double getaDouble() {
        System.out.println(Thread.currentThread());
        return 3.14;
    }
}
