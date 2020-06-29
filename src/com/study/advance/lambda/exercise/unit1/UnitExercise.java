package com.study.advance.lambda.exercise.unit1;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class UnitExercise {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person(1,"JOHN",24),
                new Person(2,"PAOLO",34),
                new Person(3,"ROBERT",54),
                new Person(4,"DINESH",17),
                new Person(5,"DINKAR", 26));

        personList.sort((person1, person2) -> person1.getName().compareTo(person2.getName()));
        // Print all Person objects
        performConditional(personList, person -> true, person -> System.out.println(person));
        // Print all whose name starts with "D"
        performConditional(personList, person -> person.getName().startsWith("D"), person -> System.out.println(person));

    }

    public static void performConditional(List<Person> list, Predicate<Person> personPredicate, Consumer<Person> personConsumer){
       list.forEach(person -> {
           if(personPredicate.test(person))
               personConsumer.accept(person);
       });
    }
}
