package com.teach.a3_javaLanguage.L10MethodReference.s4methodReference.ex3;

import com.teach.utilities.entity.EmployeeSimple;

public class Transformer {

    public final String SPACE = " ";

    public SimpleEmployee getEmployee(EmployeeSimple emp) {
        // EmployeeSimple -> Simpleemployee conversion
        SimpleEmployee simpleEmployee = SimpleEmployee.builder()
                .name(emp.getName())
                .jobLevel(Character.toString(emp.getLevel()) +SPACE+
                        Integer.toString(emp.getExperience()) +SPACE+
                        Integer.toString(emp.getAge()))
                .salary(Double.toString(emp.getSalary()))
                .build();
        return simpleEmployee;
    }
}
