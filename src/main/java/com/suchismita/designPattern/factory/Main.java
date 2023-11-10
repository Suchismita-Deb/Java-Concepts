package com.suchismita.designPattern.factory;

public class Main {
    public static void main(String[] args){
        AnimalFactory animalFactory = new AnimalFactory();
        Animal animal = animalFactory.getAnimal("Bird");

        animal.type();
    }
}