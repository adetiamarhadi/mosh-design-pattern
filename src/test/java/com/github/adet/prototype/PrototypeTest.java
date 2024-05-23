package com.github.adet.prototype;

import junit.framework.TestCase;

public class PrototypeTest extends TestCase {

    public void test() {

        Circle circle = new Circle();
        circle.setRadius(5);

        Circle anotherCircle = (Circle) circle.clone();

        System.out.println("circle: " + circle.getRadius());
        System.out.println("anotherCircle: " + anotherCircle.getRadius());

        anotherCircle.setRadius(10);

        System.out.println("anotherCircle new radius: " + anotherCircle.getRadius());
    }
}
