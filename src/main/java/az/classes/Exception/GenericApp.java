package az.classes.Exception;

import java.time.LocalDate;

public class GenericApp {

    public static void main(String[] args) {
        Integer num = 5;
        String line = "abc";
        LocalDate date = LocalDate.now();
        requireNonNull(line);
        requireNonNull(date);

        num = null;
        line = null;
        date = null;

        requireNonNull(num);
        requireNonNull(line);
        requireNonNull(date);
    }

    public static <T> T getOrElseThrow(T data) {
        if (data == null) {
            throw new NullPointerException("Invalid age");
        }
        return data;
    }

    public static <T> void requireNonNull(T data) {
        if (data == null) {
            throw new NullPointerException("Invalid age");
        }
    }
}
