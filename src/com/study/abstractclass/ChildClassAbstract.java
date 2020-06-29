package com.study.abstractclass;

public class ChildClassAbstract extends AbstractExample {

    private String name;

    public ChildClassAbstract(int iAbstract, String name) {
        super(iAbstract);
        this.name = name;
        System.out.println(this.hashCode());
    }

    @Override
    void demo() {
        System.out.println("You are inside Demo Of child");
    }

    /**
     *
     */
}
