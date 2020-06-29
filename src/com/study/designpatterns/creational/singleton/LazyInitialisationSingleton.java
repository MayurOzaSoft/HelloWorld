package com.study.designpatterns.creational.singleton;

public class LazyInitialisationSingleton {
    private volatile static LazyInitialisationSingleton INSTANCE = null;

    private LazyInitialisationSingleton() {}

    public static LazyInitialisationSingleton getSingletonClass(){

        if(null == INSTANCE){
            // Thread Safe
            synchronized (LazyInitialisationSingleton.class){
                // Double Check
                if(INSTANCE == null){
                    INSTANCE = new LazyInitialisationSingleton();
                }
            }
        }
        return INSTANCE;

    }
}
