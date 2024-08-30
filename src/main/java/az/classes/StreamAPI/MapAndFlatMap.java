package az.classes.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapAndFlatMap {

    public static void main(String[] args) {
        // map() -> numune:

        List<String> fruits = Arrays.asList("apple", "banana", "cherry");
        List<Integer> lengths = fruits.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(lengths);


        //                             flatMap() -> numune:

        // gorunduyu kimi flatMap() metodunda coxlu element olur mes:apple, apricot bir persona aiddi.

        /*List<Person> people = Arrays.asList(
                new Person("Alice", Arrays.asList("apple", "apricot")),
                new Person("Bob", Arrays.asList("banana", "blueberry")),
                new Person("Charlie", Arrays.asList("cherry", "coconut"))
        );

        List<String> fruits = people.stream()
                .flatMap(person -> person.getFruits().stream())
                .collect(Collectors.toList());*/

// fruits : [apple, apricot, banana, blueberry, cherry, coconut]
    }

}
