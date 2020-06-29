package com.study.designpatterns.behavioral.state.exercise;

public class TravelMain {
    public static void main(String[] args) {
        TravelState travelState = new TravelState(new Walking());
        travelState.getDirection();
        travelState.getETA();
    }
}
