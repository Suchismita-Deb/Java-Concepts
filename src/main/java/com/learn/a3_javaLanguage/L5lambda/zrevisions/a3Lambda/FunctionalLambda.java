package com.learn.a3_javaLanguage.L5lambda.zrevisions.a3Lambda;

import com.learn.a3_javaLanguage.L5lambda.functionalInterface.Display;

public class FunctionalLambda {
    public static void main(String[] args) {
        //Interface Display is a SAM FunctionalInterface
        Display displayStrings = (a, b) -> {
                if (a instanceof String && b instanceof String) {
                    String aString = String.valueOf(a);
                    String bString = String.valueOf(b);
                    System.out.println("Concatenated String " + aString + bString);
                } else {
                    System.out.println("##################### Non String class type #####################");
                    System.out.println("a = " + a.getClass().getName());
                    System.out.println("b = " + b.getClass().getName());
                }
        };

        displayStrings.displayResults("John", 3);
        displayStrings.displayResults("John", "Doe");

        // Functional Interface as an Argument
        lambdaTest(displayStrings);

        // Functional Interface as an Argument with definition of the ONLY method
        System.out.println("Functional Interface as an Argument with definition of the ONLY method");
        lambdaTest((a,b) -> {
            if (a instanceof String && b instanceof String) {
                System.out.println((String) a + (String) b);
            }
        });
    }

    private static void lambdaTest(Display display){
        display.displayResults("John", 3);
        display.displayResults("John", "Doe");
    }
}
