package com.teach.a1_dailyDrill;

public class A6CharacterUtilities {
    public static void main(String[] args) {
        char primitiveChar = Character.toLowerCase('N');//single quote = Character, double quotes is String
        System.out.println(primitiveChar);

        char c = '9';
        Character.isDigit(c);//True
        c = 'S';
        Character.isLetter(c);

        Character.toUpperCase('n');

        boolean isAlphabetic = Character.isAlphabetic('_');
        System.out.println(isAlphabetic);

        boolean isDigit = Character.isDigit('8');

        char titleCase = Character.toTitleCase('a');

        String str = "Niti3";
        boolean letterOrDigit = Character.isLetterOrDigit(str.charAt(4));
    }
}
