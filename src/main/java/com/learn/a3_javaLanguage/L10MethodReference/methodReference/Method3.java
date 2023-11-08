package com.learn.a3_javaLanguage.L10MethodReference.methodReference;

class StringHelper{
    String concatenate(String str1, String str2){
        return str1+str2;
    }
}

@FunctionalInterface
interface StringConverter1 {
    String concate(String str1, String str2);
}

public class Method3 {
    public static void main(String[] args) {
        StringHelper s = new StringHelper();
        StringConverter1 converter = s::concatenate;
        String res = converter.concate("Hello","World");
        System.out.println(res);
    }
}
