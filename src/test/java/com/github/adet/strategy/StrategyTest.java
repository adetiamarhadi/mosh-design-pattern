package com.github.adet.strategy;

import junit.framework.TestCase;

public class StrategyTest extends TestCase {

    public void test() {

        ImageStorage image = new ImageStorage();
        
        image.store("a", new JPGCompressor(), new BlackAndWhiteFilter());
        image.store("a", new PNGCompressor(), new BlackAndWhiteFilter());
    }
}
