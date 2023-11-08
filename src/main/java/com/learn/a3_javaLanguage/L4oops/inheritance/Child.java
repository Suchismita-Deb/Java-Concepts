package com.learn.a3_javaLanguage.L4oops.inheritance;

public class Child extends Parent{

    int property = 200;

    @Override
    public String marriage(){
        return "Overriding Parent";
    }

    public String m2(){
        return "From Child";
    }
}
