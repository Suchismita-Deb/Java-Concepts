package com.teach.a3_javaLanguage.lcollectors.c3groupby;

import com.teach.utilities.SampleData;
import com.teach.utilities.entity.EmployeeSimple;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyCalc {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,1,3,3,4,5,6,7,8,6,5,4,3,2,1);

        // Create a list of distinct elements.
        distinctElements(list);

        //Find the frequency of each element
        freq(list);

        List<EmployeeSimple> empSimple = SampleData.getSimpleEmployees();

        Map<Integer, Set<Integer>> expByAge = empSimple
                .stream()
                .filter(emp -> null != emp.getAge()) //Age not null predicate
                .filter(emp -> null != emp.getSalary()) //Salary not null predicate
                        .collect(Collectors.groupingBy(
                                EmployeeSimple::getAge,
                                Collectors.mapping(
                                        EmployeeSimple::getExperience,
                                        Collectors.toSet()
                                )
                        ));
        System.out.println("experience by age" + expByAge);

        Map<Integer,Integer> map = new HashMap<>();
        for (Integer x : list){
            map.put(x, map.getOrDefault(x,0) + 1);//default to 0 and adding 1
        }
        System.out.println(map);

        //Old way of doing same thing
        Map<Integer,Integer> map2 = new HashMap<>();
        for (Integer x : list){
            if(map2.containsKey(x)){
                map2.put(x,map2.get(x)+1);
            }else{
                map2.put(x,1);
            }
        }
        System.out.println(map2);
    }

    private static void freq(List<Integer> list) {
        Map<Integer, Long> freqMap = list
                .stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(freqMap);
    }

    private static void distinctElements(List<Integer> list) {
        Function<List<Integer>, List<Integer>> numbersFunction = Function.identity(); //returns function that always
        // returns its input argument
        List<Integer> distinct = list.stream()
                .distinct()
                .collect(Collectors.toList());


        List<Integer> inputNumbers = numbersFunction.apply(list);
        System.out.println(inputNumbers);
        System.out.println("Via Distinct");
        System.out.println(distinct);

        Set<Integer> viaSet = list.stream()
                .collect(Collectors.toSet());

        List<Integer> resultList = new ArrayList<>(viaSet);
        System.out.println("Via toSet");
        System.out.println(resultList);

    }
}
