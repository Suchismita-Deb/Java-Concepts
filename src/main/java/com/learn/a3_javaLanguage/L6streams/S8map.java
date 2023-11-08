package com.learn.a3_javaLanguage.L6streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Nitin C on 3/3/2016.
 */
public class S8map {
    public static void main(String[] args) {
        List<String> stringList = List.of("Nitin", "Nidhi", "Niti");

        // Lambda Expression
        stringList.stream()
                .map(a -> a.toLowerCase())
                .forEach(b -> System.out.println(b));

        //The same is written in method reference
        List<String> strings = stringList.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        System.out.println(strings);
    }
}
