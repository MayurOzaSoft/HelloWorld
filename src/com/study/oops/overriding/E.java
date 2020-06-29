package com.study.oops.overriding;

import java.io.IOException;

public class E {

    public static void main(String[] args) throws IOException {
        C c = new C();
        c.methodTest(); // it's within the package
    }

}
