package com.github.adet.visitor;

import junit.framework.TestCase;

public class VisitorTest extends TestCase {

    public void test() {

        HTMLDocument document = new HTMLDocument();
        document.add(new HeadingNode());
        document.add(new AnchorNode());
        document.execute(new HighlightOperation());
        document.execute(new PlainTextOperation());
    }
}
