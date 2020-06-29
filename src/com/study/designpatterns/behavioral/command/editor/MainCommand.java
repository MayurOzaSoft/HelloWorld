package com.study.designpatterns.behavioral.command.editor;

public class MainCommand {
    public static void main(String[] args) {
        var history = new History();
        var document = new HtmlEditor();
        document.setContent("Hello Command");

        var boldContent = new BoldCommand(document, history);
        boldContent.execute();
        System.out.println(document.getContent());

        var undoCommand = new UndoCommand(history);
        undoCommand.execute();

        System.out.println(document.getContent());
    }
}
