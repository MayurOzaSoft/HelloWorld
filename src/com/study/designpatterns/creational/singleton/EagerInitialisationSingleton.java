package com.study.designpatterns.creational.singleton;

public class EagerInitialisationSingleton {

    private static final EagerInitialisationSingleton INSTANCE = new EagerInitialisationSingleton();

    private EagerInitialisationSingleton() {}

    public static EagerInitialisationSingleton getSingletonClass(){ return INSTANCE; }
}
