package com.study.designpatterns.behavioral.state.exercise;

public class Bicycle implements TravelEstimator {

    @Override
    public Object getEta() {
        System.out.println("Calculating ETA (bicycling)");
        return 2;
    }

    @Override
    public int getDirection() {
        System.out.println("Calculating Direction (bicycling)");
        return 2;
    }
}
