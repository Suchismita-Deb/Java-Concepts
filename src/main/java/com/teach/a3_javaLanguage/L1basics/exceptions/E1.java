package com.teach.a3_javaLanguage.L1basics.exceptions;

public class E1 {
    public static void main(String[] args) {
        int result = -1;
        try {
            result = 10 / 0; // ArithmeticException
        } catch (ArithmeticException e) {
            System.err.println("Arithmetic Exception occurred: " + e.getMessage());
        }
    }
}
