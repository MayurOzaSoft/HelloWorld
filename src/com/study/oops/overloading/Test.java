package com.study.oops.overloading;

public class Test {

    public void methodTest(int i){
        System.out.println("Inside Method Test with Argument Int : " + i);
    }

    public void methodTest(float f){
        System.out.println("Inside Method Test with Argument float : " + f);
    }

    public void methodTest(String s){
        System.out.println("Inside Method Test with Argument String : " + s);
    }

    public void methodTest(Object o){
        System.out.println("Inside Method Test with Argument Object : " + o);
    }

    public void methodTest(StringBuffer sb){
        System.out.println("Inside Method Test with Argument StringBuffer : " + sb);
    }

    public void methodTest(int i, float f){
        System.out.println("Inside Method Test with Argument int and float : " + i + " : "+ f);
    }

    public void methodTest(float f, int i){
        System.out.println("Inside Method Test with Argument flaot and int : " + f + " : "+ i);
    }

    public void methodTest(int... i){
        System.out.println("Inside Method Test with Argument vararg i : " + i);
    }


}
