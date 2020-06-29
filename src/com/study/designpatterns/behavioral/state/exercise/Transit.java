package com.study.designpatterns.behavioral.state.exercise;

public class Transit implements TravelEstimator {
    @Override
    public Object getEta() {
        System.out.println("Calculating ETA (transit)");
        return 3;
    }

    @Override
    public int getDirection() {
        System.out.println("Calculating Direction (transit)");
        return 3;
    }
}
