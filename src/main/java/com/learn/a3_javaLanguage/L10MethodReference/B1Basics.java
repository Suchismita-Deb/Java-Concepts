package com.learn.a3_javaLanguage.L10MethodReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class B1Basics {
    public static void main(String[] args) {
        //https://nitinkc.github.io/java/java-method-reference/

        List<Integer> list = Arrays.asList(1,4,6,8,9,7,5,3,2);

        // Filter takes in a Predicate functional interface
        list.stream()
                .forEach(intVal -> System.out.print(intVal + "\t"));//Terminal; operator


        System.out.println("Using method reference");
        //Using Method Reference
        list.stream()
                .forEach(System.out::print);//Terminal; operator

        System.out.println("Make Squares");
        List<Double> squareList = list.stream()
                .map(num -> Math.pow(num, 2))
                .collect(Collectors.toList());

        System.out.println(squareList);

        System.out.println("Make Squares with Method Reference");
        List<Double> squareRootList = list.stream()
                .map(Math::sqrt)////Ref. to a static method
                .collect(Collectors.toCollection(ArrayList::new));//Ref. to a constructor


        System.out.println(squareRootList);

        String name = "Nitin";

        List<String> nameList = new ArrayList<>();
        nameList.add("Pawan");
        nameList.add("Chiranjeevi");
        nameList.add("RaviTeja");
        nameList.add("Venkatesh");
        nameList.add("Nagarjuna");

        nameList.stream()
                //.map(str -> str.toUpperCase())
                .map(String::toUpperCase)//Ref. to an instance method of an arbitrary object of a particular type
                .forEach(System.out::println);//Ref. to a static method
    }
}
