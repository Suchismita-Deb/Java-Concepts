package com.learn.a3_javaLanguage.L5lambda.zrevisions.a1InterfaceImpl;

public class Runner {
    public static void main(String[] args) {
        DisplayImpl display = new DisplayImpl();

        display.displayResults("John", 3);
        display.displayResults("John", "Doe");

    }
}
