package com.study.designpatterns.creational.singleton;

import java.io.Serializable;

public class SingletonWithHelper implements Serializable {

    private static final class SingletonClassHolder { public static SingletonWithHelper INSTANCE = new SingletonWithHelper(); }

    private SingletonWithHelper(){}

    public static SingletonWithHelper getSingletonClass(){ return SingletonClassHolder.INSTANCE; }

    protected Object readResolve() {
        return getSingletonClass();
    }

}
