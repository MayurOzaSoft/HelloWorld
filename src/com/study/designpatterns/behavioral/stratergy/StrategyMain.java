package com.study.designpatterns.behavioral.stratergy;

public class StrategyMain {
    public static void main(String[] args) {
        var imageStorage = new ImageStorage();
        imageStorage.store("state", new JpegCompressor(), new BlackAndWhiteFilter());
    }
}
