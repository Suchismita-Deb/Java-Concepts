package com.learn.a3_javaLanguage.L5lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FunctionIntrfaceAsArgs {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,4,6,8,9,7,5,3,2);
       // * Strategy pattern. writing a function to be called from Lambda

        System.out.println(total(list, element -> element%2 != 0));//Passing in a strategy : Strategy design pattern hint
        System.out.println(total(list, element -> element > 5));

        return;
    }
    public static int total(List<Integer> list,
                            Predicate<Integer> strategy ) { //Predicate is a predefined functional interface
        return list.stream()
                .filter(strategy)
                .reduce(0, (a,b) -> a+b);//Addition of two number
    }
}

