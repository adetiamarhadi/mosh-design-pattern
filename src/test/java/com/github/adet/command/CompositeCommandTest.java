package com.github.adet.command;

import com.github.adet.command.fx.Command;
import junit.framework.TestCase;

public class CompositeCommandTest extends TestCase {

    public void test() {

        CompositeCommand command = new CompositeCommand();
        command.add(new ResizeCommand());
        command.add(new BlackAndWhiteCommand());
        command.execute();
    }
}
