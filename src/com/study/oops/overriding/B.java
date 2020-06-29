package com.study.oops.overriding;

import com.study.oops.A;

import java.io.IOException;

public class B extends A {

    private int iB = 10;

    public B() throws IOException{
    }

    // Overridden Method
    public void methodA(A a){
        System.out.println("A Executed in B");
    }

    Object methodTest(){
        return null;
    }

    private final void methodTestPrivate(){

    }

}
