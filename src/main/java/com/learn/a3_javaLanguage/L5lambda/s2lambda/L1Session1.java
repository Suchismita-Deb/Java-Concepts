package com.learn.a3_javaLanguage.L5lambda.s2lambda;

import com.learn.a3_javaLanguage.L5lambda.functionalInterface.MyFunctionalInterface;
import com.learn.a3_javaLanguage.L5lambda.functionalInterface.MyFunctionalInterface0;
import com.learn.utilities.SampleData;

import java.util.List;
import java.util.function.Consumer;

public class L1Session1 {
    public static void main(String[] args) {
        int z = 10;

        MyFunctionalInterface0 xx = () -> System.out.println("Tests");
        xx.doSomework();

        //Valid Lambda as 2 arguments are expected
        MyFunctionalInterface myFunctionalInterface = (val1, val2) -> val1 * val2;////Providing the definition to the abstract method

        /* Without Curly braces we can't use return keyword */
        MyFunctionalInterface myFunctionalInterface1 = (val1, val2) -> {
             val1 = val2 + 4;
            return (val1 * val2);
        };

        //  SECOND EXAMPLE //
       List<Integer> list = SampleData.intCargoSequence(10,15);
        Consumer d = x -> System.out.println(x);//Pre-defined functional interface
        list.forEach(val -> d.accept(val));//OR

        list.forEach(val -> System.out.println(val));//OR

        list.forEach(System.out::println);
    }
}

//Any method that accepts Functional Interface as parameter, needs a Lambda