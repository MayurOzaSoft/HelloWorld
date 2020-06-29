package com.study.designpatterns.creational.prototype;

public class EmployeeWrap extends Employee implements Cloneable {
    private String title;

    public String getTitle() {
        return title;
    }

    public EmployeeWrap setTitle(String title) {
        this.title = title;
        return this;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
