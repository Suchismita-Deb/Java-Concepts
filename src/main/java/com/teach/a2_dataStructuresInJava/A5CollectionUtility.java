package com.teach.a2_dataStructuresInJava;

import java.util.*;

public class A5CollectionUtility {
    public static void main(String[] args) {
        List<Integer> integerListWithNull = Arrays.asList(5, 6, 71, 2, 3);

        Collections.sort(integerListWithNull);
        System.out.println(integerListWithNull.toString());

        Collections.sort(integerListWithNull, Comparator.reverseOrder());

        Collections.reverseOrder();
        System.out.println(integerListWithNull.toString());

        Set<Integer> integerSetWithoutNull = new TreeSet<>();//Sorting via Tree
        integerSetWithoutNull.addAll(Arrays.asList(5, 6, 71, 2, 3));

        //
        Map<String, Integer> hashMap2 = new HashMap<>();
        hashMap2.put("One", 1);hashMap2.put("Three", 3);
        hashMap2.put("Four", 4);hashMap2.put("Two", 2);

        // Convert the HashMap entries to a list
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(hashMap2.entrySet());

        // Sort the entryList based on values using a custom comparator
        Collections.sort(entryList, (entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        Map.Entry<String, Integer> max = Collections.max(entryList, (entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));
        System.out.println(max);
//
//        Collections.EMPTY_LIST;
//        Collections.emptyMap();
//        Collections.EMPTY_SET;
//
//        Collections.max();
    }
}
