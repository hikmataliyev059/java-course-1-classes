package az.classes.Wrapper;

public class User {
    private boolean active;
    private String name;
    private int age;

    public User(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{active=%s, name='%s', age=%d}".formatted(active, name, age);
    }
}
