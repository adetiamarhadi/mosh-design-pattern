package com.github.adet.flyweight;

import junit.framework.TestCase;

public class FlyweightTest extends TestCase {

    public void test() {
        PointService service = new PointService(new PointIconFactory());
        for (Point point : service.getPoints()) {
            point.draw();
        }
    }
}
