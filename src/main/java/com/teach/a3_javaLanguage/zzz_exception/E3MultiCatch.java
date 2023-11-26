package com.teach.a3_javaLanguage.zzz_exception;

import java.io.*;

public class E3MultiCatch {
    public static void main(String[] args) {
        String filePath = "src/main/resources/test.txt";
        String writeMe = "Testing";
        readFile(filePath,writeMe);

    }

    public static Integer readFile(String path, String writeMe) {

        //Try with Resource
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(path)));) {
            writeMe = writeMe + " :: "+String.valueOf(10/10);
            oos.writeObject(writeMe);

        } catch (IOException | ArithmeticException e )  {
            e.printStackTrace();
        }finally {
            System.out.println("Always Run this as well");
        }
        return null;
    }
}
