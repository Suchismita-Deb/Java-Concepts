**Homework Assignment: Lambda Expressions in Java**

**Objective:** The objective of this homework assignment is to practice working with lambda expressions in Java. Lambda expressions are an important feature introduced in Java 8, providing a concise way to represent anonymous functions. They are commonly used with functional interfaces to enable functional programming capabilities in Java.

**Instructions:**

2. **Part 1 - Basic Lambda Expressions:**
    - Create a functional interface called `MathOperation` that defines a single abstract method `int operate(int a, int b);`.
    - Implement three lambda expressions using the `MathOperation` interface for the following operations:
        - Addition: `a + b`
        - Subtraction: `a - b`
        - Multiplication: `a * b`
    - Write a method called `performOperation` that takes two integers and a `MathOperation` lambda as parameters and returns the result of applying the operation on the given integers.

3. **Part 2 - Filtering with Lambda Expressions:**
    - Create a list of integers containing random numbers (at least 10 elements).
    - Use lambda expressions and the `Stream` API to filter the list and create two new lists:
        - A list containing even numbers.
        - A list containing odd numbers.

4. **Part 3 - Sorting with Lambda Expressions:**
    - Create a list of strings with various names (at least 5 names).
    - Use lambda expressions and the `Collections.sort` method to sort the list in ascending order based on the names' lengths.

5. **Part 4 - Custom Functional Interface:**
    - Create your custom functional interface with a single abstract method related to a specific domain of your choice (e.g., `GreetingFunction` with a method `void greet(String name);`).
    - Implement a lambda expression using your custom functional interface.
    - Write a method that takes a `GreetingFunction` lambda and a name as input and invokes the lambda to perform the greeting.

**Submission:**
- Organize your Java classes into appropriate packages for each part of the assignment.
- Include comments explaining the purpose and functionality of your lambda expressions.
- Zip the entire Java project directory and submit the zip file.
- 
---