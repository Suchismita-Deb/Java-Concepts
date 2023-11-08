package com.learn.a3_javaLanguage.L11parallelStreams;

import com.google.common.collect.Lists;
import com.learn.utilities.MultiThreadUtility;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ImpureCode {
    public static final int BATCH_SIZE = 3;

    public static void main(String[] args) {
       // updates();

        updates2();

    }

    private static void updates2() {
        int size = 50000;
        List<Integer> list = new ArrayList<>(size);
        for (int i = 1; i <= size; i++) {
            list.add(i);
        }

        List<List<Integer>> partition = Lists.partition(list, BATCH_SIZE);

        System.out.println("total partitions " + partition.size());

            partition.parallelStream()
                    .forEach(singlePartition -> {
                        List<Integer> collect = singlePartition.parallelStream()
                                .map(x -> 2 * x)
                                .collect(Collectors.toList());

                        if(null != collect ){
                            System.out.println("updating # of records " + collect.size());
                            //Simulating DB Write
                            //MultiThreadUtility.delay(1000);
                        }
                    });

       // System.out.println("size = "+ objectList.size()+ "\n");
    }

    private static void updates() {
        List<Integer> list = new ArrayList<>(50000);
        for (int i = 1; i <= 50000; i++) {
            list.add(i);
        }

        List<List<Integer>> partition = Lists.partition(list, BATCH_SIZE);
        List<Object> objectList = new ArrayList<>();

        System.out.println("total partitions " + partition.size());
        try {
            partition.parallelStream()
                    .forEach(singlePartition -> {

                        //This was the impurity due to which the DB updates were not happening properly
                        singlePartition.parallelStream().forEach(singleElement -> { //no fork join here
                            singleElement = 2*singleElement;
                            objectList.add(singleElement);
                        });

                        if(null != objectList ){
                            System.out.println("updating # of records " + objectList.size());
                            //Simulating DB Write
                            //MultiThreadUtility.delay(1000);
                        }
                    });
        }catch (Exception e ){
            System.out.println(e.getMessage());
        }

        System.out.println("size = "+ objectList.size()+ "\n");
    }
}
