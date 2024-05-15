package com.github.adet.decorator;

public class CompressedCloudStream implements Stream {

    private final Stream stream;

    public CompressedCloudStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        System.out.println("CompressedCloudStream writing...");
        String compressed = compress(data);
        stream.write(compressed);
    }

    private String compress(String data) {
        return data.substring(0, 3);
    }
}
