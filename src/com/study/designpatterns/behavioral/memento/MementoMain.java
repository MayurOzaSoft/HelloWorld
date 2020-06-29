package com.study.designpatterns.behavioral.memento;

public class MementoMain {
    public static void main(String[] args) {
        var editor = new Editor();
        var history = new History();

        editor.setContent("A", "CALIGRAPHY", 12);
        history.push(editor.createState());

        editor.setContent("B", "TIMES ROMAN", 15);
        history.push(editor.createState());

        editor.setContent("C", "CALIBRI", 20);
        editor.restoreState(history.pop());
        editor.restoreState(history.pop());

        System.out.println(editor.getContent());
    }
}
