package com.learn.designPattern.structural.facade;

public class AudioConverter implements MultiMediaConverter{
    @Override
    public void converter(){
        System.out.println("This is audio converter.");
    }
}
