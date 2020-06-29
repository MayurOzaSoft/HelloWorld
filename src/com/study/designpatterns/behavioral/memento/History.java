package com.study.designpatterns.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class History {
    private List<EditorState> editorStateList = new ArrayList<>();

    public List<EditorState> getEditorStateList() {
        return editorStateList;
    }

    public History setEditorStateList(List<EditorState> editorStateList) {
        this.editorStateList = editorStateList;
        return this;
    }

    public void push(EditorState editorState){
        editorStateList.add(editorState);
    }

    public EditorState pop(){
        var lastIndex = editorStateList.size() - 1;
        var lastState = editorStateList.get(lastIndex);
        editorStateList.remove(lastState);

        return lastState;
    }
}
