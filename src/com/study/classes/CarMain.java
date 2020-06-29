package com.study.classes;

import java.util.HashMap;
import java.util.logging.LoggingPermission;

public class CarMain {

    public static void main(String[] args) {

        Car skoda = new Car();
        Car porsche = new Car();

        Class aClass = skoda.getClass();
        Class porscheClass = porsche.getClass();

        System.out.println(aClass.hashCode());
        System.out.println(porscheClass.hashCode());

        System.out.println(LoggingPermission.class.getName());

        System.out.println(aClass == porscheClass);

        HashMap<String, Integer> hashMap = new HashMap<>();

        System.out.println(String.class.getClassLoader()); // we get NULL as it is not Java object ( it is developed in C/C++ Native language)
        System.out.println(Car.class.getClassLoader());

        /**
         * There are three types of Class Loader
         * 1. Bootstrap/Primordial Class Loader (Default priority)
         * 2. Extension Class Loader
         * 3. Application/System Class Loader
         */

    }
}
