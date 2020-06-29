package com.study.designpatterns.behavioral.stratergy;

public class ImageStorage {
    public void store(String fileName, Compressor compressor, Filter filter){
        compressor.compress(fileName);
        filter.filter(fileName);
    }
}
