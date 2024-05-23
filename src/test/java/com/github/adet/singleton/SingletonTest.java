package com.github.adet.singleton;

import junit.framework.TestCase;

public class SingletonTest extends TestCase {

    public void test() {

        ConfigManager config = ConfigManager.getInstance();
        config.set("name", "juju");

        ConfigManager other = ConfigManager.getInstance();
        System.out.println(other.get("name"));
    }
}
