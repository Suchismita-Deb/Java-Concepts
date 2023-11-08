package com.learn.a3_javaLanguage.L11parallelStreams;

import com.learn.utilities.PerformanceUtility;

import java.util.List;

public class ParallelWithReduction {
    public static void main(String[] args) {
        List<Integer> list = List.of(0,1,2,3);
        int x = 10;

        PerformanceUtility.startTimer();
        Integer reduce = list
                .stream()
               //.parallelStream()//might take more time due to thread handover
                .map(num -> num + 1)
                .reduce(0, (total, num) -> addNumbers(total, num));
        PerformanceUtility.stopTimer();

        System.out.println(reduce);
    }

    private static int addNumbers(Integer a, Integer b) {
        int result = a + b;

        System.out.println("a : " + a + " b : " + b + " r : " + result + " "+ Thread.currentThread());

        return result;
    }
}
