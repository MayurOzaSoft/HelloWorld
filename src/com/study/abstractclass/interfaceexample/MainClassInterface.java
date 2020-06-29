package com.study.abstractclass.interfaceexample;

public class MainClassInterface {

    public static void main(String[] args) {
        // Child Implementation
        ChildClassInterface childClassInterface = new ChildClassInterface(34);
        childClassInterface.demo();
        childClassInterface.demoDefault(24);
        childClassInterface.exampleDemo();
        childClassInterface.staticDemo();

        ChildClassInterface.iInt = 45;
        System.out.println( ChildClassInterface.iInt );

        // Parent Implementation
        InterfaceExample interfaceExample = new ChildClassInterface(34);
        interfaceExample.demo();
        interfaceExample.demoDefault(24);
        interfaceExample.exampleDemo();
        InterfaceExample.staticDemo();

        /**
         * 1. You can not have constructor for Interface
         * 2. As it all instances of Interface are default final and static
         * 3. all Methods defined in Interface are public and abstract Default
         * 4. Static and Default methods in Interface are allowed since Java 8
         * 5. Basic need of it is not to alter existing implementation of other class and user can modify it without any problem
         * 6. You can not create Instance Object for Interface but Reference is possible w.r.t. Child Class who implementing it
         * 7. Is possible to make Interface to have similar Behaviour as interface But It will not be good idea
         * 8. You can extend Any interface with Interface and use it's property and implementation
         * 9. Interface Over Abstraction, can be defined as It has faster execution than Abstract
         * 10. When there is Abstraction with all, It is preferred to use Interface than Abstract class
         * 11. Whereas, when For Partial implementation of particular class is required then Abstract Class used
         */

    }
}
