package com.learn.a3_javaLanguage.L5lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class FunctionalProgramming {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,4,6,8,9,7,5,3,2);
        //list.add(100);//Unmodifiable List

        //External Iterator
        for (int i = 0; i < list.size(); i = i+2) {
            System.out.print(i + "\t");
        }
        System.out.println();
        //For Each loop
        for (int i : list){//For each int i in list -> print i
            System.out.print(i + "\t");
        }

        //Internal iterators
        //Implementation via anonymous inner class
        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer i) {
                System.out.println(i);
            }
        });
        System.out.println();

        //Can be reduced by just keeping only the args and the method body
        list.forEach((Integer i) -> {
                 System.out.print(i + "\t");
                return;
            });
        System.out.println();

        //Accepts Consumer (a functional interface) as a parameter
        //a function/method 4 parts -> name, return type, params/args list, BODY
        //i -> params/args & System.out.println(i) -> body


        //Can further be reduced by removing data type from argument, and removing unnecessasary return statement
        list.forEach(i -> System.out.print(i + "\t"));
        System.out.println();

        //Can be further reduced with the usage of method reference
        list.forEach(System.out::print);
        System.out.println();

        //For better understanding, step by step declaration and usage can be tried.
        Consumer consumer = x -> System.out.print(x + "\t");;//since for each accepts a consumer, declare it first
        //use the consumer with the method present in the Consumer interface
        list.forEach(val -> consumer.accept(val));//Not very prevalent
        //Or for simplicity just pass the consumer
        list.forEach(consumer);
        System.out.println();

        //or just replace the variable
        list.forEach(x -> System.out.print(x));
        System.out.println();

        list.forEach(System.out::print);
    }
}
