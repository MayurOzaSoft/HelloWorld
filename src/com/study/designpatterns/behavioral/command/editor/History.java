package com.study.designpatterns.behavioral.command.editor;

import java.util.ArrayDeque;
import java.util.Deque;

public class History {
    private Deque<Undoable> undoableList = new ArrayDeque<>();

    public void push(Undoable undoable){
        undoableList.add(undoable);
    }

    public Undoable pop(){
        return undoableList.pop();
    }

    public int size() {
        return undoableList.size();
    }
}
