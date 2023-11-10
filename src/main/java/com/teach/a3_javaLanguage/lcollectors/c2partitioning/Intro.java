package com.teach.a3_javaLanguage.lcollectors.c2partitioning;

import com.teach.utilities.SampleData;
import com.teach.utilities.entity.EmployeeSimple;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class Intro {
    public static void main(String[] args) {
        List<EmployeeSimple> employees = SampleData.getSimpleEmployees();//Call from DB

        //Split the list into 2 "sub list" based on even and odd age
        solution(employees);

        doNotDo(employees);
    }

    private static void solution(List<EmployeeSimple> employees) {
        Predicate<EmployeeSimple> evenAgedEmpPredicate = emp -> emp.getAge() % 2 == 0;

        Map<Boolean, List<EmployeeSimple>> listMap = employees.stream()
                .filter(Objects::nonNull)
                .filter(emp -> null != emp.getAge())
                //.collect(partitioningBy(x -> evenAgedEmpPredicate.test(x)));
                .collect(Collectors.partitioningBy(evenAgedEmpPredicate));//⌘Cmd ⌥Opt V	Declare the variable

        System.out.println(listMap);
    }

    private static void doNotDo(List<EmployeeSimple> employees) {
        List<EmployeeSimple> evenAgedEmp = employees.stream()
                .filter(Objects::isNull)
                .filter(emp -> null != emp.getAge())
                .filter(employee -> employee.getAge() % 2 == 0)
                .collect(Collectors.toList());

        List<EmployeeSimple> oddAgedEmp = employees.stream()
                .filter(Objects::isNull)
                .filter(emp -> null != emp.getAge())
                .filter(employee -> employee.getAge() % 2 != 0)
                .collect(Collectors.toList());
    }
}
