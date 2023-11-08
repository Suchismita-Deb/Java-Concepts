package com.learn.a3_javaLanguage.L12AsyncProgramming.multithreads;

import com.learn.utilities.MultiThreadUtility;

public class M1VirtualThreads {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = Thread.startVirtualThread(() -> task1());
        Thread thread2 = Thread.startVirtualThread(() -> task2());

        // All Virtual Threads are always daemon threads,
        // don’t forget to call join() if you want to wait on the main thread.
        thread1.join();
        MultiThreadUtility.delay(2000);
        thread2.join();

        MultiThreadUtility.delay(2000);
        System.out.println("In Main thread : DONE " + Thread.currentThread());
    }

    private static void task1(){
        System.out.println("Before :: " + Thread.currentThread());
        MultiThreadUtility.delay(1000);
        System.out.println("After :: " + Thread.currentThread());
    }

    private static void task2(){
        var x = 90;
        System.out.println("Before :: " + Thread.currentThread());
        MultiThreadUtility.delay(5000);
        System.out.println("Val x = " + x);
        System.out.println("After :: " + Thread.currentThread());
    }
}