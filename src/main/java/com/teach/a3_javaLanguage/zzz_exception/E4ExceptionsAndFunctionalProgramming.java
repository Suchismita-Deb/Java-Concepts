package com.teach.a3_javaLanguage.zzz_exception;

import java.io.IOException;
import java.util.List;

public class E4ExceptionsAndFunctionalProgramming {
    public static void main(String[] args) {

        final int divisor = 0;
        List<Integer> list = List.of(100, 34, 56, 78);

        List<Integer> updatedList = list.stream()
                .map(number -> divide(number, divisor))
                //.map(number -> divideNew(number, divisor))//Incorrect as Functional Programming and Exception handling are mutually exclusive
                //.mapSuccess()
                //.mapFailure()
                .map(num -> num + 1)
                .toList();

        System.out.println(updatedList);
    }

    
    public static Integer divide(Integer divident, Integer divisor){

        Integer result = null;
       try{
           result = divident/divisor;
       }catch (ArithmeticException ae){
           System.out.println("Divisor cant be zero, thus returning null");
           System.out.println("Exception Thrown message is : " + ae.getMessage());
           //throw new RuntimeException(ae);
       }finally {
           System.out.println("This will always run");
       }

       // Final, Finally and Finalize : Durgasoft

        System.out.println("Continuing......");
       return result;
    }

    public static Integer divideNew(Integer divident, Integer divisor) throws IOException {

        Integer result = null;
        result = divident/divisor;

        return result;
    }
}
