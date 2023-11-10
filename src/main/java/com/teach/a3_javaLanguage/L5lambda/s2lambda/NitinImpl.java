package com.teach.a3_javaLanguage.L5lambda.s2lambda;

import com.teach.a3_javaLanguage.L5lambda.functionalInterface.Nitin;

public class NitinImpl implements Nitin {
    @Override
    public String callMe(String str) {
        return "Hello " + str + "!!";
    }

    @Override
    public void testCall() {
        Nitin.super.testCall();
    }
}
