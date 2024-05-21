package com.github.adet.proxy;

public class LoggingEBookProxy implements EBook {

    private final String fileName;

    private RealEBook realEBook;

    public LoggingEBookProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void show() {

        if (realEBook == null) {
            realEBook = new RealEBook(fileName);
        }

        System.out.println("Logging");
        realEBook.show();
    }

    @Override
    public String getFileName() {
        return fileName;
    }
}
