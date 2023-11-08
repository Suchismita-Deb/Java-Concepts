package com.learn.a3_javaLanguage.L4oops.inheritance;

public class ChildsChild extends Child{

    @Override
    public String marriage() {//From Grand Parent
        return super.marriage() ;
    }

    @Override
    public String m2() {//From Parent
        return super.m2();
    }
}