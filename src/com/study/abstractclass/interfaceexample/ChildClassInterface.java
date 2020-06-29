package com.study.abstractclass.interfaceexample;

public class ChildClassInterface implements InterfaceExample {

    static int iInt = 25;

    public ChildClassInterface(int iInt) {
        this.iInt = iInt;
        System.out.println("Hash code of Child : "+ this.hashCode());
    }

    @Override
    public void exampleDemo() {
        System.out.println("Inside Child of Example Demo");
    }

    @Override
    public void demo() {
        System.out.println("Inside Child Implementation for Default Demo Method Example 1");
    }

    @Override
    public void demoDefault(int i) {
        System.out.println("Inside Child Implementation for Default Demo Method Example 2 : " + i);
    }


    static void staticDemo(){
        System.out.println("Inside Child Static Method");
    }

}
