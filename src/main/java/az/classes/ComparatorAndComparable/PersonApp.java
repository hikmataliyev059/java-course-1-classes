package az.classes.ComparatorAndComparable;

import java.util.Arrays;
import java.util.Comparator;

public class PersonApp {

    public static void main(String[] args) {
        Person[] persons = {
                new Person(4, 18, "Hikmet", 100_000),
                new Person(3, 19, "Ilkin", 200_000),
                new Person(2, 17, "Ferid", 300_000),
                new Person(1, 18, "Amil", 400_000),
        };
//        System.err.println(Arrays.toString(persons));
//        Arrays.sort(persons);
//        System.out.println(Arrays.toString(persons));

        System.out.println("====");
        System.err.println(Arrays.toString(persons));
        Arrays.sort(persons, new PersonComparator());
        System.out.println(Arrays.toString(persons));

        System.out.println("===");
        System.err.println(Arrays.toString(persons));
        Arrays.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Integer.compare(o2.age, o1.age);
            }
        });
        System.out.println(Arrays.toString(persons));
        Arrays.sort(persons, (o1, o2) -> Double.compare(o2.salary, o1.salary));
        System.out.println(Arrays.toString(persons));
    }
}
