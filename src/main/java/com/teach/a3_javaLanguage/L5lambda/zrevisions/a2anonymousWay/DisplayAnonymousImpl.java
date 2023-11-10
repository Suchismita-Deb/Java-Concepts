package com.teach.a3_javaLanguage.L5lambda.zrevisions.a2anonymousWay;

import com.teach.a3_javaLanguage.L5lambda.functionalInterface.Display;

public class DisplayAnonymousImpl {
    public static void main(String[] args) {
        Display displayStrings = new Display() {//anonymous Implementation, without a separate interface impl class
            @Override
            public void displayResults(Object a, Object b) {

                if (a instanceof String && b instanceof String) {
                    String aString = String.valueOf(a);
                    String bString = String.valueOf(b);
                    System.out.println("Concatenated String " + aString + bString);
                } else {
                    System.err.println("##################### Non String class type #####################");
                    System.err.println("a = " + a.getClass().getName());
                    System.err.println("b = " + b.getClass().getName());
                }
            }
        };

        displayStrings.displayResults("John", 3);
        displayStrings.displayResults("John", "Doe");

        //Second Implementation
        Display displayInts = new Display() {//anonymous Implementation, without a separate interface impl class
            @Override
            public void displayResults(Object a, Object b) {

                if (a instanceof Integer && b instanceof Integer) {
                    Integer aInt = (Integer) a;
                    Integer bInt = (Integer) b;
                    System.out.println("Added Integer  " + (aInt + bInt));
                } else {
                    System.err.println("##################### Non String class type #####################");
                    System.err.println("a = " + a.getClass().getName());
                    System.err.println("b = " + b.getClass().getName());
                }
            }
        };
        displayInts.displayResults(4, 3);
        displayInts.displayResults("John", "Doe");
    }
}