package com.study.designpatterns.behavioral.state.exercise;

public class TravelState {
    private TravelEstimator travelEstimator;

    public TravelState(TravelEstimator travelEstimator) {
        this.travelEstimator = travelEstimator;
    }

    public Object getETA(){
        return travelEstimator.getEta();
    }

    public int getDirection(){
        return travelEstimator.getDirection();
    }
}
