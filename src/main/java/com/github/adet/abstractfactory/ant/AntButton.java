package com.github.adet.abstractfactory.ant;

import com.github.adet.abstractfactory.Button;

public class AntButton implements Button {

    @Override
    public void render() {
        System.out.println("Ant Button");
    }
}
