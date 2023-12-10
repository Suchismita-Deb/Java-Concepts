package com.teach.a5_algoPreps.a1Bitwise.problems;

public class AddWithoutPlus {
    public static void main(String[] args) {
        int a = 0, b=-9;
        long sum = addBitwise(a,b);
        System.out.println(sum);
    }

    public static long addBitwise(long a, long b) {
        while ( b != 0){
            long carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }
}
