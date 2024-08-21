package az.classes.ComparatorAndComparable;

public final class Person implements Comparable<Person> {
    private int id;
    String name;
    int age;
    double salary;

    public Person(int id, int age, String name, double salary) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "{age=%d, id=%d, name='%s', salary=%s}".formatted(age, id, name, salary);
    }

    @Override
    public int compareTo(Person that) {
        return Integer.compare(this.id, that.id);
    }
}
