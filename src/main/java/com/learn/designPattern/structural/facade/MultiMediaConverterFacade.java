package com.learn.designPattern.structural.facade;

public class MultiMediaConverterFacade {
    private MultiMediaConverter audioConverter;
    private MultiMediaConverter videoConverter;
    private MultiMediaConverter imageConverter;
    public MultiMediaConverterFacade(){
        this.audioConverter = new AudioConverter();
        this.videoConverter = new VideoConverter();
        this.imageConverter = new ImageConverter();
    }
    public void setAudioConverter(){
        this.audioConverter.converter();
    }
    public void setVideoConverter(){
        this.videoConverter.converter();
    }
    public void setImageConverter(){
        this.imageConverter.converter();
    }

}
