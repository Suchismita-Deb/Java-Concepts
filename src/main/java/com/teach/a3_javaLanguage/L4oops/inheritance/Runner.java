package com.teach.a3_javaLanguage.L4oops.inheritance;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();//List is an interface

        ChildsChild cc = new ChildsChild();
        System.out.println(cc.property);
        System.out.println(cc.marriage());

        Parent pc = new Child();//Polymorphic Call, with a Class
        System.out.println(pc.marriage());// valid as pc is of type Parent
        //System.out.println(pc.m2);// invalid, CE : Cannot find symbol
        System.out.println(((Child) pc).m2());//TODO : From Child

        //TODO: find what is (Child) pc).m2()

        Parent p = new Parent();
        p.marriage();// Valid
        //p.m2();// Complie time error: Cannot find symbol
    }
}
