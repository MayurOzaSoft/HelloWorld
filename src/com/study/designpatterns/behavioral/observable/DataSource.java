package com.study.designpatterns.behavioral.observable;

public class DataSource extends Subject {
    private String value;

    public String getValue() {
        return value;
    }

    public DataSource setValue(String value) {
        this.value = value;
        notifyObserver();
        return this;
    }
}
