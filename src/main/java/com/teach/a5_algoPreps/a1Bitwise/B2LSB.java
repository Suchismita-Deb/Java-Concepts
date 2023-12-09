package com.teach.a5_algoPreps.a1Bitwise;

public class B2LSB {
    public static void main(String[] args) {
        int x = 0b11111111111111111111111111110001;

        //LSB and & operator
        short lsb = (short) (x & 1);//Give ONLY the LSB
        System.out.println(lsb);
    }
}
