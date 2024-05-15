package com.github.adet.composite;

import junit.framework.TestCase;

public class CompositeTest extends TestCase {

    public void test() {
        Group group1 = new Group();
        group1.add(new Shape());
        group1.add(new Shape());

        Group group2 = new Group();
        group2.add(new Shape());
        group2.add(new Shape());

        Group group = new Group();
        group.add(group1);
        group.add(group2);
        group.render();
        group.move();
    }
}
