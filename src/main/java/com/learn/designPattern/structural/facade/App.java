package com.learn.designPattern.structural.facade;

public class App {
    public static void main(String[] args) {
        MultiMediaConverterFacade multiMediaConverterFacade = new MultiMediaConverterFacade();
        multiMediaConverterFacade.setAudioConverter();
        multiMediaConverterFacade.setVideoConverter();
        multiMediaConverterFacade.setImageConverter();
    }
}
