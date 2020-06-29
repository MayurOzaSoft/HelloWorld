package com.study.designpatterns.behavioral.memento;

public class Editor {
    private String content;
    private String fontName;
    private int fontSize;

    public String getContent() {
        return "Content : "+ content + " - FontName : " + fontName + " - FontSize : "+ fontSize;
    }

    public Editor setContent(String content, String fontName, int fontSize) {
        this.content = content;
        this.fontName = fontName;
        this.fontSize = fontSize;
        return this;
    }

    public EditorState createState(){
        return new EditorState(content, fontName, fontSize);
    }

    public void restoreState(EditorState editorState){
        content = editorState.getContent();
        fontName = editorState.getFontName();
        fontSize = editorState.getFontSize();
    }
}
