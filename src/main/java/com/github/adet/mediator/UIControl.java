package com.github.adet.mediator;

import java.util.ArrayList;
import java.util.List;

public abstract class UIControl {

    private List<EventHandler> events = new ArrayList<>();

    public void addEventHandler(EventHandler eventHandler) {
        events.add(eventHandler);
    }

    protected void notifyEventHandlers() {
        for (EventHandler event : events) {
            event.handle();
        }
    }
}
