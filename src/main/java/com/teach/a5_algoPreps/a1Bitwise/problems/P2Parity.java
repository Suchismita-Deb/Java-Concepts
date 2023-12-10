package com.teach.a5_algoPreps.a1Bitwise.problems;

public class P2Parity {
    public static void main(String[] args) {
        int x = -237;
        System.out.println(Integer.toBinaryString(x));
        method1(x);
        method2(x);
    }

    private static void method2(int x) {
        boolean parity = false;//false for even cases, else true
        while(x != 0){
            x = x & (x - 1);//Unset the Rightmost set bit
            parity = !parity;
        }

        if(!parity){
            System.out.println("even parity");
        } else {
            System.out.println("odd parity");
        }
    }

    private static void method1(int x) {
        int count = 0;
        while(x != 0){
            x = x & (x - 1);//Unset the Rightmost set bit
            count++;
        }
        System.out.println("total ones = " + count);

        if(count%2 == 0){
            System.out.println("even parity");
        } else {
            System.out.println("odd parity");
        }
    }
}
