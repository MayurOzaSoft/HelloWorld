package com.study.abstractclass;

public abstract class AbstractExample {
    int iAbstract;

    public AbstractExample(int iAbstract) {
        this.iAbstract = iAbstract;
        System.out.println(this.hashCode());
    }

    abstract void demo();
    void demo(int i){
        System.out.println("You are inside Parent Abstract demo with Argument Method");
    }
}
