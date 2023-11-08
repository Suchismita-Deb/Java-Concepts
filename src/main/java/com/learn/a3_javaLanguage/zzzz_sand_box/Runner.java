package com.learn.a3_javaLanguage.zzzz_sand_box;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Main thread # " + Thread.currentThread());
        new Multithread().run();

        int i = 10 / 0;
    }
}
