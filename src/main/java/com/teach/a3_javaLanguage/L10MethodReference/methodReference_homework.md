**Assignment: Method Reference in Java**

(https://nitinkc.github.io/java/java-method-reference/)[https://nitinkc.github.io/java/java-method-reference/]

**Objective:** 
The objective of this assignment is to practice working with method references in Java. 
Method references provide a shorthand syntax for referring to methods without actually invoking them. 
They are commonly used with functional interfaces, making the code more concise and readable.

**Instructions:**

2. **Part 1 - Basic Method Reference:**
    - Define a functional interface called `StringConverter` with a single abstract method `String convert(String input);`.
    - Implement the following methods:
        - `static String toUpperCase(String input)` that converts the input string to uppercase.
        - `static String toLowerCase(String input)` that converts the input string to lowercase.
        - `static String reverseString(String input)` that reverses the input string.
    - Use method references to create instances of `StringConverter` for each of the above methods.

3. **Part 2 - Instance Method Reference:**
    - Create a class called `StringHelper` with an instance method `String concatenate(String str1, String str2)` that concatenates two strings.
    - Create an instance of `StringHelper`.
    - Use an instance method reference to create an instance of `StringConverter` that invokes the `concatenate` method.

4. **Part 3 - Constructor Reference:**
    - Create a class called `Person` with fields `name` and `age`.
    - Define a constructor for the `Person` class that takes two parameters (name and age) and initializes the fields.
    - Define a functional interface `PersonFactory` with a single abstract method `Person create(String name, int age);`.
    - Use a constructor reference to create an instance of `PersonFactory` that refers to the `Person` constructor.

5. **Part 4 - Using Method References in Stream API:**
    - Create a list of strings containing names of people.
    - Use the `Stream` API and method references to perform the following tasks:
        - Convert all names to uppercase.
        - Sort the names in ascending order.
        - Print each name using the `System.out` reference.

6. **Part 5 - Custom Method Reference Scenario:**
    - Define a functional interface `CustomFunction` with a single abstract method `int customOperation(int a, int b);`.
    - Implement a static method `static int multiply(int a, int b)` that returns the product of `a` and `b`.
    - Use a method reference to create an instance of `CustomFunction` that refers to the `multiply` method.

**Bonus**
- Explore and implement method references with non-static methods.
- Use method references in real-world scenarios and discuss their benefits over lambda expressions.