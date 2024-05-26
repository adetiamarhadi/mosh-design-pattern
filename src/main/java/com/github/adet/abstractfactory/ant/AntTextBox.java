package com.github.adet.abstractfactory.ant;

import com.github.adet.abstractfactory.TextBox;

public class AntTextBox implements TextBox {

    @Override
    public void render() {
        System.out.println("Ant TextBox");
    }
}
