package com.learn.designPattern.structural.facade;

public class VideoConverter implements MultiMediaConverter{
    @Override
    public void converter() {
        System.out.println("This is video converter.");
    }
}
