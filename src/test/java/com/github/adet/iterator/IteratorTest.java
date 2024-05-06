package com.github.adet.iterator;

import junit.framework.TestCase;

public class IteratorTest extends TestCase {

    public void test() {
        BrowseHistory history = new BrowseHistory();
        history.push("a");
        history.push("b");
        history.push("c");

        Iterator iterator = history.createIterator();
        while (iterator.hasNext()) {
            String url = iterator.current();
            System.out.println(url);
            iterator.next();
        }
    }
}
