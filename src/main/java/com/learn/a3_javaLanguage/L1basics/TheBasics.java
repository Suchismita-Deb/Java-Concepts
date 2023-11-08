package com.learn.a3_javaLanguage.L1basics;

public class TheBasics {
    public static void main(String[] args) {
        var a = "Nitin";// Java is strictly typed language

        final double PI = 3.1415;

        //a = 10; // INVALID in java.
        if(a instanceof String){
            System.out.println(a);
        }
    }
}
