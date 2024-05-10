package com.github.adet.chain.client;

import com.github.adet.chain.Authenticator;
import com.github.adet.chain.Compressor;
import com.github.adet.chain.Encryptor;
import com.github.adet.chain.Handler;
import com.github.adet.chain.HttpRequest;
import com.github.adet.chain.Logger;
import com.github.adet.chain.WebServer;
import junit.framework.TestCase;

public class ChainTest extends TestCase {

    public void test() {
        Handler encryptor = new Encryptor(null);
        Handler compressor = new Compressor(encryptor);
        Handler logger = new Logger(compressor);
        Handler authenticator = new Authenticator(logger);

        WebServer server = new WebServer(authenticator);
        server.handle(new HttpRequest("admin", "1234"));
    }
}
