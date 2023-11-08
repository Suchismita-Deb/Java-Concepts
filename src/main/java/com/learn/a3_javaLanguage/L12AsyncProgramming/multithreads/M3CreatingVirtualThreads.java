package com.learn.a3_javaLanguage.L12AsyncProgramming.multithreads;

import java.text.DecimalFormat;
import java.util.concurrent.*;

public class M3CreatingVirtualThreads {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        FromThreadAPI(); //Thread API
        ofVirtual();//Thread of Virtual
        ofPlatform();//Of Platform
        executorService1();//Via executor service
        executorService2();
    }

    private static void executorService2() {
        //Try with resources
        try (ExecutorService myExecutor = Executors.newVirtualThreadPerTaskExecutor()) {
            Future<?> future = myExecutor.submit(myTask2());
            future.get();
            System.out.println("Task completed");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    private static void executorService1() throws InterruptedException, ExecutionException {
        var executorService = Executors.newVirtualThreadPerTaskExecutor();
        Future<?> submit = executorService
                .submit(() -> mathTask());

        Object o = submit.get();
        //System.out.println(o);//(o); //Emoticons Won't work in windows
    }

    private static void ofVirtual() {
        Thread.ofVirtual()
                .name("My-Thread")
                .start(() -> myTask());
        //.start(myTask2());
    }

    private static void ofPlatform() {
        Thread thread = Thread.ofPlatform()
                .daemon(false)
                .name("ofPlatform")
                .start(()->myTask());
    }

    private static void FromThreadAPI() {
        Thread thread = Thread.startVirtualThread(() -> myTask());
        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static void myTask() {
        System.out.println("From Task 1 : " + Thread.currentThread());
    }

    private static String mathTask() {
        System.out.println("From mathTask : " + Thread.currentThread());
        return new DecimalFormat("0.00").format(Math.PI);
    }

    private static Runnable myTask2() {//NOT USEFUL FOR ANY OTHER SERVICE. DO NOT WRITE SUCH CODE
        return () -> System.out.println("From MyTask Test : " + Thread.currentThread());
    }
}