package com.learn.a3_javaLanguage.L10MethodReference.methodReference;

@FunctionalInterface
interface CustomFunction{
    int customOperation(int a,int b);
}

public class Method6 {
    public static int multiply(int a,int b){
        return a*b;
    }

    public static void main(String[] args) {
        // Method reference for the CustomFunction
        CustomFunction c = Method6::multiply;// First static method reference.
        int res = c.customOperation(8,9);// Invoke the implementation method.
        System.out.println(res);
    }
}
