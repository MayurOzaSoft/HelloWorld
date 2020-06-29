package com.study.designpatterns.behavioral.observable;

public class Chart implements Observer {
    private DataSource dataSource;

    public Chart(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("Chart got Updated : "+dataSource.getValue());
    }
}
