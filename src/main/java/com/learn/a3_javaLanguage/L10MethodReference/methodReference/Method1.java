package com.learn.a3_javaLanguage.L10MethodReference.methodReference;

import java.util.List;

public class Method1 {
    public void m1(){
        System.out.println("m1() method called");
    }

    public static void m2(){
        System.out.println("m2() method called");
    }

    public static void main(String[] args) {
        Method1.m2();//calling static method.

        Method1 m = new Method1();
        m.m1();// calling instance method.

        //Using Method reference
        //Method1::m2;
        //m::m1;

        List<String> names = List.of("Rohan","Mohan","Shilpa");
        names.forEach(System.out::println);
        System.out.println();

        names.stream()
                .forEach(System.out::println);
    }
}
