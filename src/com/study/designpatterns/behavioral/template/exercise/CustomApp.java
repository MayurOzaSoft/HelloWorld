package com.study.designpatterns.behavioral.template.exercise;

public class CustomApp extends Window {
    @Override
    protected void after() {
        System.out.println("After Close");
    }

    @Override
    protected void before() {
        System.out.println("Before Close");
    }
}
