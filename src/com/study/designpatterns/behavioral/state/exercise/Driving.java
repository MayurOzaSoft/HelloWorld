package com.study.designpatterns.behavioral.state.exercise;

public class Driving implements TravelEstimator {

    @Override
    public Object getEta() {
        System.out.println("Calculating ETA (driving)");
        return 1;
    }

    @Override
    public int getDirection() {
        System.out.println("Calculating Direction (driving)");
        return 1;
    }
}
