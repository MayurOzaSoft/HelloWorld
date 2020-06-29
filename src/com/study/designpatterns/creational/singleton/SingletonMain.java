package com.study.designpatterns.creational.singleton;

public class SingletonMain {

    public static void main(String[] args) {
        EagerInitialisationSingleton eagerInitialisationSingleton = EagerInitialisationSingleton.getSingletonClass();
        LazyInitialisationSingleton lazyInitialisationSingleton = LazyInitialisationSingleton.getSingletonClass();
        StaticBlockSingleton staticBlockSingleton = StaticBlockSingleton.getInstance();

        SingletonWithHelper singletonWithHelper = SingletonWithHelper.getSingletonClass();
        System.out.println(singletonWithHelper.hashCode());
        SingletonWithHelper withHelper = SingletonWithHelper.getSingletonClass();
        System.out.println(withHelper.hashCode());
    }
}
