package com.learn.a3_javaLanguage.L2strings.stringMethods;

public class StrBlank {
    public static void main(String[] args) {
        System.out.println("".isBlank());//True
        System.out.println(" ".isBlank());//True -> Returns true if the string is empty or contains only white space
        System.out.println("Malgudi Days".isBlank());//False

        String s = null; // IF s contains Memory and where is it stored.
        if(null != s){// TODO: Check why null == object should be preferred
            System.out.println(s.isBlank());
        }

        //HINT :
        if(s == null){
            System.out.println("s == null");
        }

    }
}
