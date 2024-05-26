package com.github.adet.abstractfactory.app;

import com.github.adet.abstractfactory.WidgetFactory;

public class ContactForm {

    public void render(WidgetFactory widgetFactory) {
        widgetFactory.createButton().render();
        widgetFactory.createTextBox().render();
    }
}
