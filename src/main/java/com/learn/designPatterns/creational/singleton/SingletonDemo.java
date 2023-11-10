package com.learn.designPatterns.creational.singleton;

class SingletonDemo {

    private SingletonDemo() {
    }

    //private static SingletonDemo singletonDemo = new SingletonDemo();//Eager Evaluation
    private static SingletonDemo singletonDemo;//Eager Evaluation


    //Lazy mode
    public static SingletonDemo of(){
        if(null == singletonDemo){
            System.out.println("First time call");
            singletonDemo = new SingletonDemo();//Preventing from creating multiple instances
        }
        return singletonDemo;
    }

    public String doSomething(){
        return "Nitin";
    }
}