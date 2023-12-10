package com.teach.a5_algoPreps.a1Bitwise.problems;

public class MultiplyBitwise {
    public static void main(String[] args) {
        long a = 242389745;
        long b = 783648340;

        long result = multiplyBitwise(a,b);

    }

    private static long multiplyBitwise(long a, long b) {
        long result = 0;
        while (a != 0){
            if((a & 1) == 1){//LSB
                result = AddWithoutPlus.addBitwise(result, b);
            }
            a = a >>1;
            b = b <<1;
        }
        return result;
    }
}
