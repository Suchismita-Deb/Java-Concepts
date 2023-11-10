package com.teach.a3_javaLanguage.L10MethodReference.s4methodReference.ex3;

public class MethodRefTest {

    public <T> T testMethodRef(T a, T b, Learnable<T> learnable){
        return learnable.learn(a,b);
    }
}
