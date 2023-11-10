package com.teach.a3_javaLanguage.L5lambda.zrevisions.a1InterfaceImpl;

import com.teach.a3_javaLanguage.L5lambda.functionalInterface.Display;

public class DisplayImpl implements Display {

    @Override
    public void displayResults(Object a, Object b) {
        if (a instanceof String && b instanceof String) {
            String aString = String.valueOf(a);
            String bString = String.valueOf(b);
            System.out.println("Concatenated String " + aString + bString);
        } else {
            System.err.println("##################### Non String class type " +
                    "#####################");
            System.err.println("a = " + a.getClass().getName());
            System.err.println("b = " + b.getClass().getName());
        }
    }

    public int test(){
        return 0;
    }
}
