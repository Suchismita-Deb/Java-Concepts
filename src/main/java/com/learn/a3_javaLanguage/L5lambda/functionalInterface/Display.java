package com.learn.a3_javaLanguage.L5lambda.functionalInterface;

@FunctionalInterface
public interface Display<T> {//Generic Data type
    void displayResults(T a, T b);
}