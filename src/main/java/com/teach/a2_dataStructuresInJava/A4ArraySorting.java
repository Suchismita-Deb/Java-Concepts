package com.teach.a2_dataStructuresInJava;

import java.util.*;

public class A4ArraySorting {
    public static void main(String[] args) {
        int[] primitiveIntArray = {4,3,1,2,85,85,65};
        System.out.println(Arrays.toString(primitiveIntArray));

        Arrays.sort(primitiveIntArray);//Modifies the original Array
        System.out.println(Arrays.toString(primitiveIntArray).toString());

        Integer[] wrapperIntArray = {4,3,1,2,85,85,65};

        // Arrays Class has method asList that converts Array into a List (or Arraylist)
        Collections.sort(Arrays.asList(wrapperIntArray));//Modifies the original Array
        System.out.println(Arrays.asList(wrapperIntArray).toString());

        Collections.sort(Arrays.asList(wrapperIntArray));

    }
}
