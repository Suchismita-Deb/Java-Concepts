package com.teach.designPatterns.creational.builder;

import lombok.ToString;

@ToString
public class Person {
    private final String name;
    private final String email;
    private final String address;
    private final Integer age;
    private final String nameOfMother;//Optional, if the person is orphan

    public Person(PersonBuilder personBuilder) {
        this.name = personBuilder.name;
        this.email = personBuilder.email;
        this.address = personBuilder.address;
        this.age = personBuilder.age;
        this.nameOfMother = personBuilder.nameOfMother;
    }


    //TODO : May need refactoring
    public static class PersonBuilder {
        private final String name;//Compulsory Params
        private final String email;//Compulsory Params
        private String address;
        private Integer age;
        private String nameOfMother;


        public PersonBuilder(String name, String email) {
            this.name = name;
            this.email = email;
        }


        public PersonBuilder setAddress(String address) {
             this.address = address;
             return this;
        }

        public PersonBuilder setAge(Integer age) {
            this.age = age;
            return this;
        }

        public PersonBuilder setNameOfMother(String nameOfMother) {
            this.nameOfMother = nameOfMother;
            return this;
        }

        public Person build(){
            return new Person(this);
        }

    }
}
