package com.teach.a3_javaLanguage.L13exception;

import java.io.*;

public class E2TryWithResources {
    public static void main(String[] args) {
        String filePath = "src/main/resources/test.txt";
        String writeMe = "Testing";
        readFile(filePath,writeMe);
    }

    public static Integer readFile(String path, String writeMe) {

        //Try with Resource
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(path)));) {
            oos.writeObject(writeMe);
        } catch (FileNotFoundException e)  {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
