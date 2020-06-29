package com.study.designpatterns.behavioral.stratergy;

public class JpegCompressor implements Compressor {
    @Override
    public void compress(String string) {
        System.out.println("JPEG FORMAT COMPRESSOR");
    }
}
