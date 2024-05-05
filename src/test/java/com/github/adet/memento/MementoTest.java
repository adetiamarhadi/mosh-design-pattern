package com.github.adet.memento;

import junit.framework.TestCase;

public class MementoTest extends TestCase {

    public void testApp() {

        Editor editor = new Editor();
        History history = new History();

        editor.setContent("a");
        history.push(editor.createState());

        editor.setContent("b");
        history.push(editor.createState());

        editor.setContent("c");

        editor.restore(history.pop());

        assertEquals("b", editor.getContent());

        editor.restore(history.pop());

        assertEquals("a", editor.getContent());
    }
}
