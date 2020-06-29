package com.study.immutable;

import java.lang.reflect.Field;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Class can be defined as Immutable with three steps
 *
 * 1. class define as final
 * 2. variable declaration should be private and final
 * 3. define augmented constructor with variable definition
 * 4. in order to control reflection mechanism use Security Manager of Java and restrict access of Reflection Package
 *
 * @author Mayur Ozardekar
 *
 */
public class ImmutableMainClass {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        List<String> stringList = Stream.of("Mayur", "Test", "Rahul").collect(Collectors.toList());

        ImmutableClass immutableClass = new ImmutableClass(1, "Mayur", stringList);
        System.out.println(immutableClass.getName());
        System.out.println(immutableClass.getNumber());

        Field field = immutableClass.getClass().getDeclaredField("name");
        field.setAccessible(true);
        field.set(immutableClass, String.valueOf("Rahul"));

        System.out.println(immutableClass.getName());

        System.out.println(immutableClass.getStringList().size());

        immutableClass.getStringList().add("Anil");
        System.out.println(immutableClass.getStringList().size());

    }
}
