package com.github.adet.abstractfactory.material;

import com.github.adet.abstractfactory.Button;

public class MaterialButton implements Button {

    @Override
    public void render() {
        System.out.println("Material Button");
    }
}
