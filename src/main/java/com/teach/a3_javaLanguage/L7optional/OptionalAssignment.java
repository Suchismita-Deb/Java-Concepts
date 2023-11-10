package com.teach.a3_javaLanguage.L7optional;

import com.github.javafaker.Book;
import com.github.javafaker.Faker;

import java.util.*;

public class OptionalAssignment {
    private static final Faker FAKER = Faker.instance();

    public static void main(String[] args) {
        // Part 1 - Introduction to Optional
        Optional<Integer> optionalNumber = getNumber(); // Implement getNumber() method

        // Part 2 - Working with Optional
        int squaredValue = squareNumber(optionalNumber); // Implement squareNumber() method
        System.out.println("Squared value: " + squaredValue);

        // Part 3 - Handling Optional Absence
        Optional<String> optionalName = getName(); // Implement getName() method
        String greeting = getGreeting(optionalName); // Implement getGreeting() method
        System.out.println(greeting);

        // Part 4 - Chaining Optional Operations
        List<String> namesList = Arrays.asList("Alice", null, "bob", "", "CHARLIE");
        processNames(namesList); // Implement processNames() method

        // Part 5 - Handling Null with Optional
        Integer nullableValue = null; // You can set a value here to test
        Optional<Integer> optionalValue = convertToOptional(nullableValue); // Implement convertToOptional() method
        System.out.println("Optional Value: " + optionalValue);

        // Part 6 - Exception Handling with Optional
        readAndParseInteger(); // Implement readAndParseInteger() method

        // Part 7 - Custom Class with Optional
        Optional<Book> optionalBook = getBook(); // Implement getBook() method
        String authorName = getAuthorName(optionalBook); // Implement getAuthorName() method
        System.out.println("Author Name: " + authorName);
    }

    private static Optional<Integer> getNumber() {
        return null;
    }

    private static void processNames(List<String> namesList) {
    }

    private static String getAuthorName(Optional<Book> optionalBook) {
        //Check the condition when the optionalBook is null;
        return optionalBook.get().author();
    }

    private static Optional<Book> getBook() {
        return getBook();
    }

    private static void readAndParseInteger() {
        
    }

    private static Optional<Integer> convertToOptional(Integer nullableValue) {
        return null;
    }

    private static Optional<String> getName() {
        return null;
    }

    private static String getGreeting(Optional<String> optionalName) {
        return null;
    }

    private static int squareNumber(Optional<Integer> optionalNumber) {
        return 0;
    }

}
