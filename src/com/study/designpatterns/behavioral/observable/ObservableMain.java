package com.study.designpatterns.behavioral.observable;

public class ObservableMain {
    public static void main(String[] args) {
        var dataSource = new DataSource();
        var spreadSheet = new SpreadSheet(dataSource);
        var chart = new Chart(dataSource);

        dataSource.addObserver(spreadSheet);
        dataSource.addObserver(chart);

        dataSource.setValue("Test");
    }
}
