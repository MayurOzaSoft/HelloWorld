package com.study.abstractclass;

public class MainClassAbstract {
    public static void main(String[] args) {
        ChildClassAbstract childClass = new ChildClassAbstract(10, "Mayur");
        System.out.println("Hash Code for Child is : "+ childClass.hashCode());
        // Invoke Demo Method
        childClass.demo();

        // Parent Method Invocation
        AbstractExample abstractExample = new ChildClassAbstract(10, "Mayur");
        abstractExample.demo();
        abstractExample.demo(10);
    }

    /**
     * 1. This defined we have equal Hash code from all invocation
     * 2. Only Child Class object is created and Parent Constructor is invoked only for initialisation of instance variables
     * 3. Abstract class can have constructor in order to initialize instance variables
     * 4. Creation of Object for Abstract is not possible
     */

    /**
     * 1. New and Constructor are two different things, New responsible for creation of Object and Constructors are basically used for initialisation
     */
}
