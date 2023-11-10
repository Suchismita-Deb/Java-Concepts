package com.teach.a3_javaLanguage.L12AsyncProgramming.multithreads;

import com.teach.utilities.MultiThreadUtility;

public class M0Traditionalthreads {
    public static void main(String[] args) {
        Runnable task1 = () -> task1();//Declare a Runnable
        Thread thread1 = new Thread(task1);

        Thread thread2 = new Thread(() -> task2());

        thread1.start();
        thread2.start();

        System.out.println("Main thread " + Thread.currentThread());
    }

    public static void task1() {
        int x = 90;
        System.out.println("entering task1 " + Thread.currentThread());
        MultiThreadUtility.delay(1000);
        System.out.println("exiting task1 " + Thread.currentThread() + " - Value of x = " + x);
    }

    public static void task2() {
        System.out.println("entering task2 " + Thread.currentThread());
        MultiThreadUtility.delay(1000);
        System.out.println("exiting task2 " + Thread.currentThread());
    }
}
