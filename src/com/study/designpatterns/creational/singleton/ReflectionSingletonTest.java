package com.study.designpatterns.creational.singleton;

import java.lang.reflect.Constructor;

public class ReflectionSingletonTest {

    public static void main(String[] args) {
        EagerInitialisationSingleton instanceOne = EagerInitialisationSingleton.getSingletonClass();
        EagerInitialisationSingleton instanceTwo = null;
        try {
            Constructor[] constructors = EagerInitialisationSingleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                // Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                instanceTwo = (EagerInitialisationSingleton) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }

}
