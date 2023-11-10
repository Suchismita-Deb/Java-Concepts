package com.teach.designPatterns.creational.builder;

public class Runner {
    public static void main(String[] args) {
        Person person = new Person.PersonBuilder("name","email")
                .setAge(25)
                .build();

        System.out.println(person);
    }
}
