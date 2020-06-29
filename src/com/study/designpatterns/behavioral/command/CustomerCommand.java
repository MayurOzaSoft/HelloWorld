package com.study.designpatterns.behavioral.command;

public class CustomerCommand implements BaseCommand {

    private CustomerService customerService;

    public CustomerCommand(CustomerService customerService) {
        this.customerService = customerService;
    }

    @Override
    public void execute() {
        customerService.addCustomer();
    }
}
