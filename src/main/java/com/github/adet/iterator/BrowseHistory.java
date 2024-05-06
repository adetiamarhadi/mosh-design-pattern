package com.github.adet.iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {

    private String[] urls = new String[10];

    private int size;

    public void push(String url) {
        urls[size++] = url;
    }

    public String pop() {
        return urls[--size];
    }

    public Iterator createIterator() {
        return new ArrayInterator(this);
    }

    public class ArrayInterator implements Iterator {

        private final BrowseHistory history;

        private int index;

        public ArrayInterator(BrowseHistory history) {
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return index < history.size;
        }

        @Override
        public String current() {
            return history.urls[index];
        }

        @Override
        public void next() {
            index++;
        }
    }
}
