package com.teach.a3_javaLanguage.L1basics;

public class ShortCircuit {
    public static void main(String[] args) {
        Integer i = 10;
        Integer j = 20;
        Integer k = 10;

        //if(i == j || j ==k || i ==k) {// Double pipe || is short circuit, it evaluates the first and moves on
        if(i==j && i==k){ // i==j is false so short circuit does not check the next condition
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        //Another Test
        if (i == j & i == k) { // complete evaluation of 2 conditions is done before result
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
