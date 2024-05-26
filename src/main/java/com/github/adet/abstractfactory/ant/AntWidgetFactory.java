package com.github.adet.abstractfactory.ant;

import com.github.adet.abstractfactory.Button;
import com.github.adet.abstractfactory.TextBox;
import com.github.adet.abstractfactory.WidgetFactory;

public class AntWidgetFactory implements WidgetFactory {

    @Override
    public Button createButton() {
        return new AntButton();
    }

    @Override
    public TextBox createTextBox() {
        return new AntTextBox();
    }
}
