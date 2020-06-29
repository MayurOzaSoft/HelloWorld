package com.study.designpatterns.behavioral.command.editor;

public class HtmlEditor {
    private String content;

    public String getContent() {
        return content;
    }

    public HtmlEditor setContent(String content) {
        this.content = content;
        return this;
    }

    public void makeBold(){
        content = "<b>" + content + "</b>";
    }
}
