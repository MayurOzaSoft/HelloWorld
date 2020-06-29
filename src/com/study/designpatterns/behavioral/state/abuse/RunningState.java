package com.study.designpatterns.behavioral.state.abuse;

public class RunningState implements State {
    private StopWatch stopWatch;

    public RunningState(StopWatch stopWatch) {
        this.stopWatch = stopWatch;
    }

    @Override
    public void click() {
        stopWatch.setState(new StoppedState(stopWatch));
        System.out.println("Stopped");
    }
}
