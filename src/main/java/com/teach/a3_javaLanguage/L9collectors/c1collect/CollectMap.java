package com.teach.a3_javaLanguage.L9collectors.c1collect;

import java.util.*;
import java.util.stream.Collectors;

public class CollectMap {
    public static void main(String[] args) {
        List<String> namesList = Arrays.asList("Harry Potter", "Hermione Granger", "Ron Weasley",
                "Albus Dumbledore", "Severus Snape", "Voldemort",
                "Hagrid", "Dumbledore", "Draco Malfoy",
                "Neville Longbottom", "Luna Lovegood", "Sirius Black", "Remus Lupin");

        Map<String, Integer> sortedMap = namesList.stream()
                .collect(Collectors.toMap(
                        name -> name,//KeyMapper
                        name -> name.length(),//ValueMapper
                        (existing, replacement) -> existing,//merge function
                       TreeMap::new //Supplier
                ));

        // Print the sorted map
        sortedMap.forEach((name, length) -> System.out.println(name + ": " + length));

    }
}