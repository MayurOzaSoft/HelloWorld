package com.study.oops.coupling;

public class TestCasting {

    public static void main(String[] args) {

        // Related to Child Parent Relationship
        Object object = new String("Test Java");
        Object objectNew = (String) object;
        // StringBuffer stringBuffer = (StringBuffer) object;

        // Assigning to incompatible Type String and String buffer are nowhere related to each other
        // Either with parent to child or child to parent
        String string = new String("Test String");
        // stringBuffer = (StringBuffer) string; // Compile time error

        Integer integer = new Integer(10);
        Number number = (Integer) integer;
        object = (Number) number;

        // Above three line can be converted like
        object = new Integer[10];
        System.out.println(object == number);
        System.out.println(integer == number);
        System.out.println(object);
    }
}
