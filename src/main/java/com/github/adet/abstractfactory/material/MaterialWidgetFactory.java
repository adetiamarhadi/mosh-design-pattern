package com.github.adet.abstractfactory.material;

import com.github.adet.abstractfactory.Button;
import com.github.adet.abstractfactory.TextBox;
import com.github.adet.abstractfactory.WidgetFactory;

public class MaterialWidgetFactory implements WidgetFactory {

    @Override
    public Button createButton() {
        return new MaterialButton();
    }

    @Override
    public TextBox createTextBox() {
        return new MaterialTextBox();
    }
}
