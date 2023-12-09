package com.teach.a4_designPatterns.creational.singleton;

public class Runner {
    public static void main(String[] args) {

        //SingletonDemo singletonDemo = new SingletonDemo();//should result in Error

        //What's needs to be done toget the object

        //In Spring Framwerok
        //@Autowired
        //SingletonDemo singletonDemo;
        //singletonDemo.doSomething();

        SingletonDemo singletonDemo = SingletonDemo.of();//Static factory method
       //System.out.println(singletonDemo.doSomething());
        SingletonDemo singletonDemo1 = SingletonDemo.of();//Static method
        SingletonDemo singletonDemo2 = SingletonDemo.of();//Static method

        if(singletonDemo == singletonDemo1 && singletonDemo == singletonDemo2 ){
            System.out.println("same objects");
        }

        SingletonDemoEnum object = SingletonDemoEnum.INSTANCE;//TODO: Whats is INSTANCE
        System.out.println(object.doSomething());

        reflectionDemo();
    }

    //Class.forName Demo
    private static void reflectionDemo() {
        Class<?> c = null;
        try {
            c =  Class.forName("com.teach.a4_designPatterns.creational.singleton.SingletonDemo");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(c.getConstructors());
    }

    /*
* There are four different ways to create objects in java:
1.     Using new keyword
2.     Using Class.forName()://reflection
3.     Using clone():
4.     Using Object Deserialization:
    Using new Intance() method
* */

}
