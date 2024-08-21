package az.classes.ComparatorAndComparable;

import java.util.Comparator;

public final class PersonComparator implements Comparator<Person> {

    @Override
    public int compare(Person s1, Person s2) {
        if (!s1.name.equals(s2.name)) {
            return s1.name.compareTo(s2.name);
        } else if (s1.age != s2.age) {
            return Integer.compare(s1.age, s2.age);
        }
        return Double.compare(s2.salary, s1.salary);
    }
}

