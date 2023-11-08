## Functional Interface

SAM : Single Abstract Method
```java
MyfunctionalInterface0 mf = () -> System.out.println("Some String");
```

## Functional Interface as a param
Any method that accepts Functional Interface as parameter, needs a Lambda

* ForEach receives a Consumer functional parameter
* Functional Interface : can automatically be elevated to lambda expression
* In other words, you can Only use lambdas for functional interfaces
* A functional interface is a SAM (Single abstract Method) interface. it can only have one abstract method
* that method has signature with parameter coming in.
* Functional interface assign a contract!!

```java
default void forEach(Consumer<? super T> action);
        
list.forEach(val -> System.out.println(val));

//OR
Consumer d = x -> System.out.println(x);
list.forEach(val -> d.accept(val));
```
## Valid Lamdba

For Simpler one liner Lambdas, with or without parameters
```java
MyFunctionalInterface0 xx = () -> System.out.println("Tests");
MyFunctionalInterface1 y = (x -> x+x);//Providing the definition to the abstract method
MyFunctionalInterface2 deepthi = (val1, val2) -> val1 * val2;//Valid Lambda as 2 arguments are expected


@FunctionalInterface
interface MyFunctionalInterface0{
    //SAM : Single Abstract Method
    void doSomework();
}

@FunctionalInterface
interface MyFunctionalInterface1{
    Integer doSomeJob(int a);
}

@FunctionalInterface
interface MyFunctionalInterface2{
    Integer doSomeTask(int a, int b);
}
```

# Lambdas

Lambda Expression is just an anonymous (nameless) function/class.

[Anonymous Inner Class](https://www.baeldung.com/java-anonymous-classes)

Function does not have a state.

Object has a state

method vs function

* Strategy pattern. writing a function to be called from Lambda

Lazy Evaluation -> Streams

.streams.peek -> for debugging


# Imperative style 
    -> what to do and How to do

```java
//What to do? : Iterate over the list
for(int i = 0; i < list.size(); i = i+1)//How to do -> one by one OR alternate elements
```

# Functional style 
    -> only What to do (intent)

```java
//What to do? : Iterate over the list
list.stream.forEach(x -> System.out.println(x));//iterates one by one ; Skipped how to do

map.forEach((k,v) -> System.out.println(k+":"+v));
```


1 input -> 1 output -> Function -> map()
1 input -> 0 output -> consumer -> Accept()
0 input -> 0 output -> NO PRACTICAL USE
0 input -> 1 output -> Supplier -> 

