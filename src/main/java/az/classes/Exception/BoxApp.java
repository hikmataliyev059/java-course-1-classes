package az.classes.Exception;

import java.util.Optional;

public class BoxApp {
    private static int num;

    public static void main(String[] args) {
        Box<String> hikmet = new Box<>("hikmet", num);
        Box<Integer> hikmet2 = new Box<>(45, num);
        System.out.println(hikmet.getWeight());

//        Box box = new Box(24, 56);
//        box.setData(true);

        Box<Integer> boxedAge = validateAge(20);
        System.out.println(boxedAge.isEmpty());

        Optional<Integer> optionalInteger = validateAge2(25);
        System.err.println(optionalInteger.get());
    }

    public static Box<Integer> validateAge(int age) {
        if (age < 0 || age > 150) {
            return new Box(null, num);
        } else {
            return new Box<>(age * 5, num);
        }
    }

    public static Optional<Integer> validateAge2(Integer age) {
        if (age < 0 || age > 150) {
            return Optional.empty();
        } else {
            return Optional.of(age * 5);
        }
    }
}
