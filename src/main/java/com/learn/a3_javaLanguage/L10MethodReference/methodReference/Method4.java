package com.learn.a3_javaLanguage.L10MethodReference.methodReference;

class Person{
    public String name;
    public int age;
    public Person(String name, int age){
        name = this.name;
        age = this.age;
    }
}
@FunctionalInterface
interface PersonFactory{
    Person create(String name, int age);
}
public class Method4 {
    public static void main(String[] args) {
        PersonFactory p = Person::new;

        // New Person
        Person p1 = p.create("Rohan",98);
    }
}