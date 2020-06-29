package com.study.designpatterns.behavioral.state.abuse;

public class StopWatch {
    private State state = new StoppedState(this);

    public State getState() {
        return state;
    }

    public StopWatch setState(State state) {
        this.state = state;
        return this;
    }

    // private boolean isRunning;
    public void click(){
        state.click();
        /*if(!isRunning){
            System.out.println("Running");
            isRunning = true;
        } else {
            System.out.println("Stopped");
            isRunning = false;
        }*/
    }
}
