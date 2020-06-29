package com.study.designpatterns.behavioral.command.exercise;

import java.util.ArrayDeque;
import java.util.Deque;

public class History {
    private Deque<VideoEditor> videoEditorDeque = new ArrayDeque<>();

    public void push(VideoEditor videoEditor){
        videoEditorDeque.push(videoEditor);
    }

    public VideoEditor pop(){
        return videoEditorDeque.pop();
    }
}
