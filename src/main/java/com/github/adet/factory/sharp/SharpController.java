package com.github.adet.factory.sharp;

import com.github.adet.factory.matcha.Controller;
import com.github.adet.factory.matcha.ViewEngine;

public class SharpController extends Controller {

    @Override
    protected ViewEngine createViewEngine() {
        return new SharpViewEngine();
    }
}
