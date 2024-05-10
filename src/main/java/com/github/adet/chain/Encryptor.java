package com.github.adet.chain;

public class Encryptor extends Handler {

    public Encryptor(Handler next) {
        super(next);
    }

    @Override
    protected boolean doHandle(HttpRequest request) {
        System.out.println("Encryption");
        return false;
    }
}
