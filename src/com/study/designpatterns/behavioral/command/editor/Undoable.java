package com.study.designpatterns.behavioral.command.editor;

public interface Undoable extends Command {
    void unexecute();
}
