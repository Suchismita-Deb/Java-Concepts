package com.teach.a5_algoPreps.a1Bitwise;

public class B3SetBit {
    public static void main(String[] args) {
        int y = 0b10101000;
        int setBitTest = (y & (y-1));//flip/unset the Right most Set bit
        System.out.println(Integer.toBinaryString(setBitTest));

        int extractSetBitTest = (y & ~(y-1));//it isolates the rightmost 1-bit of y and sets all other bits to 0
        System.out.println(Integer.toBinaryString(extractSetBitTest));

    }
}
