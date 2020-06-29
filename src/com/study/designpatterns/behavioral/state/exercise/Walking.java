package com.study.designpatterns.behavioral.state.exercise;

public class Walking implements TravelEstimator {
    @Override
    public Object getEta() {
        System.out.println("Calculating ETA (walking)");
        return 4;
    }

    @Override
    public int getDirection() {
        System.out.println("Calculating Direction (walking)");
        return 4;
    }
}
