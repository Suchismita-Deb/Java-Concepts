package com.teach.a2_dataStructuresInJava;

import java.util.Arrays;
import java.util.Comparator;

public class A2ArraysUtilityClass {
    public static void main(String[] args) {
        //Sort takes array
        int intArray[] = {4,5,3,8,2,71};

        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));

        //Comparator can only be used with a CLASS
        Integer integerArray[] = {4,5,3,8,2,71};
        Arrays.sort(integerArray, Comparator.reverseOrder());//Reverse sorting
        System.out.println(Arrays.toString(integerArray));

        String[] stringArray = {"one", "two", "three", "four"};
        Arrays.sort(stringArray);
        System.out.println(Arrays.toString(stringArray));
        Arrays.sort(stringArray, Comparator.reverseOrder());
        System.out.println(Arrays.toString(stringArray));
    }
}