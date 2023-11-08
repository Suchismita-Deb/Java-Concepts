package com.learn.a3_javaLanguage.zzz_exception;

public class IncorrectEmailIdException extends Exception{
    public IncorrectEmailIdException(String message){
        super(message);
        System.err.println("incorrect emailId");
    }
}
