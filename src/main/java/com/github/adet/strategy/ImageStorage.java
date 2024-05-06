package com.github.adet.strategy;

public class ImageStorage {

    public void store(final String fileName, Compressor compressor, Filter filter) {
        compressor.compress(fileName);
        filter.apply(fileName);
    }
}
