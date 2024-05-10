package com.github.adet.chain;

public class Logger extends Handler {

    public Logger(Handler next) {
        super(next);
    }

    @Override
    protected boolean doHandle(HttpRequest request) {
        System.out.println("Log");
        return false;
    }
}
