package com.study.advance.lambda.exercise.unit3;

import com.study.advance.lambda.exercise.unit1.Person;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MethodReferenceExample2 {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person(1,"JOHN",24),
                new Person(2,"PAOLO",34),
                new Person(3,"ROBERT",54),
                new Person(4,"DINESH",17),
                new Person(5,"DINKAR", 26));

        personList.sort((person1, person2) -> person1.getName().compareTo(person2.getName()));
        // Print all Person objects
        System.out.println("--------------");
        performConditional(personList, person -> true, System.out::println); // person -> System.out.println(person)
        // Print all whose name starts with "D"
        System.out.println("--------------");
        performConditional(personList, person -> person.getName().startsWith("D"), System.out::println); // person -> System.out.println(person)
        // Perform Stream
        System.out.println("--------------");
        performStreamOperations(personList);

    }

    private static void performStreamOperations(List<Person> personList) {

        Optional<Integer> optionalInteger = personList.stream()
                                                .map(Person::getAge)
                                                .collect(Collectors.toList())
                                                .stream()
                                                .reduce((i, j) -> i+j);

        optionalInteger.ifPresent(System.out::println);
    }

    public static void performConditional(List<Person> list, Predicate<Person> personPredicate, Consumer<Person> personConsumer){
        list.forEach(person -> {
            if(personPredicate.test(person))
                personConsumer.accept(person);
        });
    }
}
