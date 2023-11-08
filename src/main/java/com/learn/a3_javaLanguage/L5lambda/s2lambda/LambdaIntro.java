package com.learn.a3_javaLanguage.L5lambda.s2lambda;

import com.learn.a3_javaLanguage.L5lambda.functionalInterface.Nitin;

public class LambdaIntro {
    public static void main(String[] args) {

        //Old Style : Not preferred anymore, unless forced by Framework
        NitinImpl nitin = new NitinImpl();
        System.out.println(nitin.callMe("Rishi"));

        NitinImpl suchi = anonymousImplementation();
        System.out.println(suchi);
        System.out.println(suchi.callMe("Nitin"));

        Nitin n = (str) -> str + "Awesome!!";//Lambda -> can be replaced with a Functional interface
        System.out.println(n.callMe("Nitin "));

        Nitin s = (st) -> { //MultiLine Lambda. Not testable
            StringBuilder sb = getStringBuilder();//Lambda in multiple Line : EXTRACT THE METHOD OUT FOR TESTABILITY
            sb.append(st);
            return sb.toString();//
        };
        System.out.println(s.callMe("Suchismita"));
    }

    private static NitinImpl anonymousImplementation() {
        NitinImpl suchi = new NitinImpl() {
            @Override
            public String callMe(String str) {
                return str + " overriding super.callMe(str)";
            }
        };
        return suchi;
    }

    private static void anonymousStyle() {
        Nitin nitin2 = new Nitin() {
            @Override
            public String callMe(String str) {
                return str + "!!";
            }
        };
        System.out.println(nitin2.callMe("Nitin"));
    }

    private static StringBuilder getStringBuilder() {
        StringBuilder sb = new StringBuilder();
        sb.append(Runtime.getRuntime().totalMemory());
        sb.append((String) null);
        //sb.append(1/0);
        sb.append("\n");
        sb.append(Runtime.getRuntime().freeMemory());
        sb.append("Test");
        return sb;
    }


    //Consumer
    //Supplier
    //Predicate
    //Function
}


