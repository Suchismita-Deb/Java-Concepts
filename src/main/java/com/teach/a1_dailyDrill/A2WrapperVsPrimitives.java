package com.teach.a1_dailyDrill;

public class A2WrapperVsPrimitives {
    public static void main(String[] args) {
        //Primitive types
        int size = 5;
        int primitiveIntArray[] = new int[size];
        char charPrim[] = new char[size];
        float floatPrim[] = new float[size];
        double doublePrim[] = new double[size];
        boolean booleanPrim[] = new boolean[size];//true/false

        //Wrapper Classes wraps a value of the primitive type in an object
        Integer intWrap[] = new Integer[size];
        Character charWrap[] = new Character[size];
        Float floatWrap[] = new Float[size];
        Double doubleWrap[] = new Double[size];
        Boolean booleanWrap[] = new Boolean[size];//null/true/false -> Nullable Boolean
    }
}
