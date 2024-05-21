package com.github.adet.proxy;

public class RealEBook implements EBook {

    private final String fileName;

    public RealEBook(String fileName) {
        this.fileName = fileName;
        load();
    }

    private void load() {
        System.out.println("Loading the ebook " + fileName);
    }

    @Override
    public void show() {
        System.out.println("Showing the ebook " + fileName);
    }

    @Override
    public String getFileName() {
        return fileName;
    }
}
