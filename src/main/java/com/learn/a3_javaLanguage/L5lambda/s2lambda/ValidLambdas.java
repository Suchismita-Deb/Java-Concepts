package com.learn.a3_javaLanguage.L5lambda.s2lambda;

import com.learn.a3_javaLanguage.L5lambda.functionalInterface.MyFunctionalInterface;
import com.learn.a3_javaLanguage.L5lambda.functionalInterface.MyFunctionalInterface0;
import com.learn.a3_javaLanguage.L5lambda.functionalInterface.Nitin;

import java.util.Comparator;

public class ValidLambdas {
    public static void main(String[] args) {
        MyFunctionalInterface0 x;
        x = () -> System.out.println("Nitin");

        /* RETURN Always need curly braces and ends with a colon */
        MyFunctionalInterface y;
        y = (Integer a,Integer b) -> {
            String str;
            str = String.valueOf((a.intValue() + b.intValue()));
            return Integer.valueOf(str);
        };

        Comparator<String> comparator = (String o1, String o2) -> 0;//VALID

        // () can be omitted only if there is EXACTLY ONE Parameter and NO DATA TYPE
        Nitin z;
        z = (String str) -> str.toUpperCase();
        z = str -> str.toUpperCase();

        //multiple parameters need to be enclosed in the brackets.
        //a,b -> a.startsWith("Ni")//DOES NOT COMPILE : need small brackets
        //CORRECT: (a,b) -> a.startsWith("Ni")


        /*
        c -> return 10;// DOES NOT COMPILE : return keyword without {}
        CORRECT: c -> { return 10; }
        OR c -> 10;
        a -> {return a.startsWith("test")}//DOES NOT COMPILE : need ; after return
        CORRECT:
        a -> { return a.startsWith("test"); }

        // DATA TYPES FOR THE INPUT PARAMETERS OF A LAMBDA EXPRESSION IS OPTIONAL
        (int y, z) -> { int x = 1; return x+y; }// DOES NOT COMPILE : Either both have data types or none
        CORRECT: ( y, z) -> { int x = 1; return x+y; }
        OR CORRECT: (int y, int z) -> { int x = 1; return x+y; }

        (a,b) -> { int a = 9;
            return a+b
            }//DOES NOT COMPILE: Redeclaration of a

        (a,b) -> { int c = 9; return a+b }// CORRECT AS C is an independent local variable
         */
    }
}