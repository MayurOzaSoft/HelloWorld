package com.study.generics;

public class GenericMainClass {
    public static void main(String[] args) {
        GenericClass<String> stringGenericClass = new GenericClass<>("TEST JAVA GENERIC");
        stringGenericClass.getTypeName();
        System.out.println(stringGenericClass.getObject());

        GenericClass<Integer> integerGenericClass = new GenericClass<>(10);
        integerGenericClass.getTypeName();
        System.out.println(integerGenericClass.getObject());

        TestGeneric<Integer> integerTestGeneric = new TestGeneric<>();
        // TestGeneric<String> stringTestGeneric = new TestGeneric<String>(); // Compile time error "Not within it's Bound

        TestInterfaceGeneric<Runnable> runnableTestInterfaceGeneric = new TestInterfaceGeneric<>();
        TestInterfaceGeneric<Thread> threadTestInterfaceGeneric = new TestInterfaceGeneric<>();
        // TestInterfaceGeneric<Integer> integerTestInterfaceGeneric = new TestInterfaceGeneric<Integer>(); // Compile time error "Not within it's Bound

        /**
         * ArrayList<?> arrayList = new ArrayList<?>() // INVALID
         * ArrayList<?> arrayList = new ArrayList<? extends Number>() // INVALID
         */


    }
}
