package com.github.adet.strategy;

public class JPGCompressor implements Compressor {

    @Override
    public void compress(String fileName) {
        System.out.println("Compressing using JPEG");
    }
}
