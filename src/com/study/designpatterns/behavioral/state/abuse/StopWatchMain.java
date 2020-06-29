package com.study.designpatterns.behavioral.state.abuse;

public class StopWatchMain {
    public static void main(String[] args) {
        var stopWatch = new StopWatch();
        stopWatch.click();
        stopWatch.click();
    }
}
