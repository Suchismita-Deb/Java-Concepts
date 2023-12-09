package com.teach.a4_designPatterns.creational.singleton;

//This ENUM acts as a singleton bean
public enum SingletonDemoEnum {
    INSTANCE;

    public String doSomething(){
        return "Do something inside Enum";
    }

}
