package com.learn.designPattern.structural.facade;

public class ImageConverter implements MultiMediaConverter{
    @Override
    public void converter(){
        System.out.println("This is Image converter.");
    }
}
