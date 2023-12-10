package com.teach.a5_algoPreps.a1Bitwise.problems;

public class P1FindZeroesNOnes {
    public static void main(String[] args) {
        int num = 237;
        System.out.println(Integer.toBinaryString(num));
        int count = findZeroes_NoTrailingZeroes_forPositiveNums(num);
        System.out.println(Integer.toBinaryString(num));
        int count2 = findZeroes_WithTrailingZeroes(num);
        System.out.println("Totoal number of zeroes : " + count2);
        int countOnes = findOnes(num);
        System.out.println("Totoal number of Ones : " + countOnes);
    }

    private static int findZeroes_NoTrailingZeroes_forPositiveNums(int num) {
        int numOfZeroes = 0;
        while (num != 0){
            if((num & 1) == 0)
                numOfZeroes++;

            num = num >>> 1;//END THE LSB
        }
        return numOfZeroes;
    }

    private static int findZeroes_WithTrailingZeroes(int num) {
        int numOfOnes = findOnes(num);
        return 32-numOfOnes;//int in Java is 32 bits long

    }

    private static int findOnes(int num) {
        int numOfOnes = 0;
        while (num != 0){
            numOfOnes += num & 1;
            num = num >>> 1;//END THE LSB
        }
        return numOfOnes;
    }
}
