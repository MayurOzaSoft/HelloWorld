package com.study.abstractclass.interfaceexample.multiple;

public class InterfaceCommonImpl implements InterfaceCommon {

    @Override
    public void methodCommon() {
        System.out.println("Inside Common Method Execution");
    }

    /**
     * Through this we can manage to do multiple Inheritance but ideally it is not considered as Inheritance
     */
}
