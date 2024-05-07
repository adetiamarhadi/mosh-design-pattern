package com.github.adet.command;

import com.github.adet.command.fx.Button;
import com.github.adet.command.fx.Command;
import junit.framework.TestCase;

public class CommandTest extends TestCase {

    public void test() {

        CustomerService service = new CustomerService();
        Command command = new AddCustomerCommand(service);
        Button button = new Button(command);
        button.click();
    }
}
