package com.study.generics;

public class GenericClass<T> {

    T object;

    public GenericClass(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public void getTypeName(){
        System.out.println("The Type of T is : "+ object.getClass().getName());
    }
}
