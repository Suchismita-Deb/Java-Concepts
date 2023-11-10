package com.teach.a3_javaLanguage.zzz_utilityTesters;

import com.github.javafaker.Faker;

public class FakerJava {
    private static final Faker FAKER = Faker.instance();

    public static void main(String[] args) {
        System.out.println(FAKER.funnyName().name());

        System.out.println(FAKER.harryPotter().spell());
    }
}
