package com.github.adet.decorator;

public class CloudStream implements Stream {

    @Override
    public void write(String data) {
        System.out.println("Default CloudStream writing...");
        System.out.println("Storing " + data);
    }
}
