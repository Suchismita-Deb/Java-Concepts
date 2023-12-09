package com.teach.a5_algoPreps.a1Bitwise;

public class B5XorTrick {
    public static void main(String[] args) {
        // XOR Trick - Cancellation
        int a = 90, b = 90;
        int c = a ^ b;
        System.out.println(c);

        System.out.println(a ^ (~a));//All 1's (32 bits) = -1

        // XOR Trick - Cancellation




    }
}
