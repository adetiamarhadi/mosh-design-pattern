package com.github.adet.chain;

public class Authenticator extends Handler {

    public Authenticator(Handler next) {
        super(next);
    }

    @Override
    protected boolean doHandle(HttpRequest request) {
        System.out.println("Authentication");
        boolean isValid = ("admin".equals(request.getUsername()) && "1234".equals(request.getPassword()));
        return !isValid;
    }
}
