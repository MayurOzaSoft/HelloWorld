package com.study.designpatterns.behavioral.command.editor;

public class BoldCommand implements Undoable {
    private String prevContent;
    private HtmlEditor htmlEditor;
    private History history;

    public BoldCommand(HtmlEditor htmlEditor, History history) {
        this.htmlEditor = htmlEditor;
        this.history = history;
    }

    @Override
    public void unexecute() {
        htmlEditor.setContent(prevContent);
    }

    @Override
    public void execute() {
        prevContent = htmlEditor.getContent();
        htmlEditor.makeBold();
        history.push(this);

    }
}
