package com.github.adet.proxy;

import junit.framework.TestCase;

public class ProxyTest extends TestCase {

    public void test() {

        Library library = new Library();
        String[] fileNames = {"a", "b", "c", "d", "e"};
        for (String fileName : fileNames) {
            library.add(new LoggingEBookProxy(fileName));
        }

        library.openEBook("a");
        library.openEBook("a");
    }
}
