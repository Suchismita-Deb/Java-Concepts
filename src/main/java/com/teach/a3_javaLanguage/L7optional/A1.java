package com.teach.a3_javaLanguage.L7optional;

import com.teach.utilities.SampleData;
import com.teach.utilities.entity.EmployeeSimple;

import java.util.*;
import java.util.stream.Collectors;

public class A1 {
    public static void main(String[] args) {

        List<EmployeeSimple> retList = countByName();
        if (retList.size() == 0){
            System.out.println("Zero size");
        }

        //Optional<String> stringOptional = Optional.of(null);//Optional Field - NEVER
        //methodName(stringOptional);
    }

    private static List<EmployeeSimple> countByName() {
        List<EmployeeSimple> employees = SampleData.getSimpleEmployees();//Synchronous

        List<EmployeeSimple> empWithAgeGT30 = new ArrayList<>();

        empWithAgeGT30 =  employees.parallelStream()
                .filter(Objects::nonNull)
                .filter(emp -> null != emp.getAge())
                .filter(emp -> emp.getAge() >30)
                .collect(Collectors.toList());
                //.forEach(emp -> finalEmpWithAgeGT3.add(emp));//mutation -> not thread safe operation -> impure function

        if(empWithAgeGT30 == null) {
            return Collections.emptyList();
            //using Static Factory - takes care of empty List
            //return List.of();//Returns empty list
        }

        return empWithAgeGT30;

    }

    public static void methodName(Optional<String> name){ //Anti-pattern - DO NOT DO THIS
        return;
    }

    public static void methodName1(String name){
        return;
    }

    public static void methodName(){ //Overloaded
        return;
    }

}
