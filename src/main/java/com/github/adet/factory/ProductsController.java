package com.github.adet.factory;

import com.github.adet.factory.matcha.Controller;
import com.github.adet.factory.matcha.MatchaViewEngine;
import com.github.adet.factory.sharp.SharpController;

import java.util.HashMap;
import java.util.Map;

public class ProductsController extends Controller /*SharpController*/ {

    public void listProducts() {
        Map<String, Object> context = new HashMap<>();
        render("products.html", context);
    }
}
