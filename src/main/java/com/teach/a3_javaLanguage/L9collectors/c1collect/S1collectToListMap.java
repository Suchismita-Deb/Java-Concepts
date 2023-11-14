package com.teach.a3_javaLanguage.L9collectors.c1collect;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by Nitin Chaurasia on 1/31/18 at 12:05 AM.
 */
public class S1collectToListMap {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Pawan");list.add("Chiranjeevi");
        list.add("RaviTeja");list.add("Venkatesh");
        list.add("Nagarjuna");

        System.out.println(list);

        //Create a new list with actors having names longer than 9 characters
        //case1(list);

        //Defining boolean predicate to test if the string is shorter than 9 characters
        //case2(list);

        //Change all the names to uppercase
        //case3(list);

        //Create a mpa of name, nameLength
        Map<String, Integer> map = list.stream()
                .collect(Collectors.toMap(name -> name, String::length));

        Map<String, Integer> map2 = list.stream()
                .collect(Collectors.toMap(Function.identity(), String::length));
        //map.forEach((key, value) -> System.out.println(key + " :: "+value));
        System.out.println(map);

    }

    private static void case3(List<String> list) {
        // Using a function as a return value is expected
        Function<String, String> upperCase = String::toUpperCase;//(str) -> str.toUpperCase();
        List<String> l2 = list
                .stream()
                .map(upperCase)
                .collect(Collectors.toList());
        //System.out.println(l2);
    }

    private static void case2(List<String> list) {
        Predicate<String> strShort = (str -> str.length() < 9);
        //Create another list of short characters
        List<String> l1 = list.stream().filter(strShort).collect(Collectors.toList());
        //System.out.println(l1);
    }

    private static void case1(List<String> list) {
        List<String> l = list.stream()
                .filter(str -> str.length() >= 9)
                .collect(Collectors.toList());
        System.out.println(l);
    }
}
