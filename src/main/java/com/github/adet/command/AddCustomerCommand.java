package com.github.adet.command;

import com.github.adet.command.fx.Command;

public class AddCustomerCommand implements Command {

    private final CustomerService service;

    public AddCustomerCommand(CustomerService service) {
        this.service = service;
    }

    @Override
    public void execute() {
        service.addCustomer();
    }
}
