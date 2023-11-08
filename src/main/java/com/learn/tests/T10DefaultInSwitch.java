package com.learn.tests;

public class T10DefaultInSwitch {
    public static void main(String[] args) {
        System.out.println("OK");
       // System.out.println(lights("When.NIGHT"));
    }

    public static String lights(When when){
        return switch (when){
            case DAY -> "No Light";
            case NIGHT -> "Lights needed";
        };
    }
}

enum When{DAY, NIGHT}//, DAWN}
