package com.study.advance.lambda.exercise.unit1;

import java.util.function.BiConsumer;

public class UnitExerciseTwo {
    public static void main(String[] args) {
        int[] intNumbers = {1,2,3,4,5};
        process(intNumbers, wrapperLambda((k, v) -> System.out.println(k*v)));
    }

    private static void process(int[] intNumbers, BiConsumer<Integer, Integer> integerBiConsumer) {
        for (int i : intNumbers) {
            integerBiConsumer.accept(i, 2);
        }
    }

    private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> integerBiConsumer){
        try{
            return  integerBiConsumer;//(k, v) -> System.out.println(Double.valueOf(k/2d));
        } catch(ArithmeticException ae){
            System.out.println(ae.getMessage());
        }
        return integerBiConsumer;
    }
}
