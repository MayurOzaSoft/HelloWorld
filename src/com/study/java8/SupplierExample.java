package com.study.java8;

import java.util.Optional;
import java.util.function.*;

public class SupplierExample {
    public static void main(String[] args) {

        Supplier<Double> supplier = () -> Math.random();
        DoubleSupplier doubleSupplier = Math::random;

        System.out.println(supplier.get());
        System.out.println(doubleSupplier.getAsDouble());

        Optional<Double> optional = Optional.empty();
        System.out.println(optional.orElseGet(supplier));

        /**
         * IntSupplier int getAsInt();
         * DoubleSupplier double getAsDouble();
         * LongSupplier long getAsLong();
         * BooleanSupplier boolean getAsBoolean();
         */


    }
}
