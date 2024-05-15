package com.github.adet.adapter;

import com.github.adet.adapter.avaFilters.Caramel;

public class CaramelFilter implements Filter {

    private final Caramel caramel;

    public CaramelFilter(Caramel caramel) {
        this.caramel = caramel;
    }

    @Override
    public void apply(Image image) {
        caramel.init();
        caramel.render(image);
    }
}
