package com.github.adet.builder;

import junit.framework.TestCase;

public class BuilderTest extends TestCase {

    public void test() {

        Presentation presentation = new Presentation();
        presentation.addSlide(new Slide("Slide 1"));
        presentation.addSlide(new Slide("Slide 2"));

        PresentationBuilder builder = new MovieBuilder();
        presentation.export(builder);
    }
}
