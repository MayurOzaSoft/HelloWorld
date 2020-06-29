package com.study.designpatterns.behavioral.command;

public class CommandMain {
    public static void main(String[] args) {
        var button = new Button(new CustomerCommand(new CustomerService()));
        button.click();
    }
}
