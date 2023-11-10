package com.teach.a3_javaLanguage.L5lambda.s3predefinedFunctionalInterface;

import com.teach.utilities.SampleData;
import com.teach.utilities.entity.EmployeeSimple;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class SupplierUsage {
    public static void main(String[] args) {
        List<EmployeeSimple> simpleEmployeesList = SampleData.getSimpleEmployees();

        Supplier<List<EmployeeSimple>> supplier = () -> {
            return simpleEmployeesList;
        };

        List<EmployeeSimple> employeeSimples = supplier.get();
        System.out.println(employeeSimples);

        Supplier<EmployeeSimple> supplier1 = () -> {
            return simpleEmployeesList.get(1);
        };

        EmployeeSimple employeeSimples1 = supplier1.get();
        System.out.println(employeeSimples1);

        simpleEmployeesList.stream().collect(Collectors.toList());

    }
}
