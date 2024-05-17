package com.github.adet.facade;

import junit.framework.TestCase;

public class FacadeTest extends TestCase {

    public void test() {
        NotificationService service = new NotificationService();
        service.send("Hello world", "target");
    }
}
