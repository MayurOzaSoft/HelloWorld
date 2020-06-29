package com.study.designpatterns.behavioral.command;

public class Button {
    private BaseCommand baseCommand;

    public Button(BaseCommand baseCommand) {
        this.baseCommand = baseCommand;
    }

    public void click(){
        baseCommand.execute();
    }
}
