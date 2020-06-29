package com.study.designpatterns.behavioral.state.abuse;

public class StoppedState implements State {
    private StopWatch stopWatch;

    public StoppedState(StopWatch stopWatch) {
        this.stopWatch = stopWatch;
    }

    @Override
    public void click() {
        stopWatch.setState(new RunningState(stopWatch));
        System.out.println("Running");
    }
}
