package com.github.adet.adapter;

import com.github.adet.adapter.avaFilters.Caramel;
import junit.framework.TestCase;

public class AdapterTest extends TestCase {

    public void test() {
        ImageView imageView = new ImageView(new Image());
        imageView.apply(new CaramelFilter(new Caramel()));
    }
}
