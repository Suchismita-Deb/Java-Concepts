package com.teach.a5_algoPreps.a1Bitwise.problems;

public class BitMasking {
    // 1 << n
    public static void main(String[] args) {
        int x = 237;
        int n = 3;

        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.bitCount(x));//Count # of one

        int bitMask = 1 << n;//1 followed by n zeroes

        //Set the nth bit
        int y = x | bitMask;
        System.out.println(Integer.toBinaryString(y));

        //Unset the nth bit
        int z = x & ~bitMask;
        System.out.println(Integer.toBinaryString(z));

        //Toggle the nth bit
        int a = x ^ bitMask;
        System.out.println(Integer.toBinaryString(a));

        //Check if the nth bit is 1
        boolean check = (x & bitMask) != 0;


        boolean is2RaisedToN = (x & (x - 1)) == 0;
        /*
        10
        100
        1000;
        10000
        */
    }
}
