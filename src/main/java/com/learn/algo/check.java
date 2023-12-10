package com.learn.algo;

public class check {
    public static void main(String[] args) {
        int n = 0b110010101;
        System.out.println(Integer.toBinaryString(-5));
        int x = (n&1);
        System.out.println(n&1);
        int n1 = (int)n&(n-1);
        System.out.println(n1);//404
        System.out.println(Integer.toBinaryString(n&~(n-1)));
    }
}
