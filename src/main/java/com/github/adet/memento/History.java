package com.github.adet.memento;

import java.util.ArrayList;
import java.util.List;

public class History {

    private List<EditorState> states = new ArrayList<>();

    public void push(EditorState state) {
        states.add(state);
    }

    public EditorState pop() {
        int lastIndex = states.size() - 1;
        return states.remove(lastIndex);
    }
}
