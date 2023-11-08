package com.learn.a1_dailyDrill;

public class A1Primitives {
    public static void main(String[] args) {
        int primitiveInt = 10;//primitive integer. non nullable, [1,2,3]
        //Auto Boxing
        Integer wrapperInt = primitiveInt;//Wrapper Class, nullable, [null, 1,2,3]

        //Auto unboxing
        primitiveInt = wrapperInt;

        int minValPrimitive = Integer.MAX_VALUE;
        Integer minValWrapper = Integer.MAX_VALUE;

        System.out.println(minValPrimitive);
        System.out.println(minValWrapper);

        short s = (short) 32768;//16 bits, -32768 to 32767
        //Narrowing type casting, reduces the scope, refer TypeCastingTests.java
        System.out.println(s);// rotate from highest to minimum


        int test = 90;
        Integer wrapperTest =Integer.valueOf(test);
        Integer wrapperTest2 = test;

    }
}
