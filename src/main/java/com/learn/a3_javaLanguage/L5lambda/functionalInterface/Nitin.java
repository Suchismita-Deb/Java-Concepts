package com.learn.a3_javaLanguage.L5lambda.functionalInterface;

@FunctionalInterface
public interface Nitin {
    String callMe(String str);//SAM

    default void testCall(){
        System.out.println("Call from Default");
    }
}
