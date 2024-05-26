package com.github.adet.abstractfactory.material;

import com.github.adet.abstractfactory.TextBox;

public class MaterialTextBox implements TextBox {

    @Override
    public void render() {
        System.out.println("Material TextBox");
    }
}
