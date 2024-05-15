package com.github.adet.decorator;

import junit.framework.TestCase;

public class DecoratorTest extends TestCase {

    public void test() {

        String data = "1234-1234-1234-1234";

        Stream stream = new CompressedCloudStream(new EncryptedCloudStream(new CloudStream()));

        stream.write(data);
    }
}
