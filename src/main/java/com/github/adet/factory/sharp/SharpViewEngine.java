package com.github.adet.factory.sharp;

import com.github.adet.factory.matcha.ViewEngine;

import java.util.Map;

public class SharpViewEngine implements ViewEngine {

    @Override
    public String render(String viewName, Map<String, Object> context) {
        return "View rendered by Sharp";
    }
}
