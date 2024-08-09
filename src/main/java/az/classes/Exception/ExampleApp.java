package az.classes.Exception;

import java.util.Optional;

public class ExampleApp {

    public static void main(String[] args) {
        String a = "";
        System.out.println(checkName(a));

        String b = null;
        System.out.println(checkName(b));

        String c = "Hello Hikmet";
        System.out.println(checkName(c));
    }

    private static Optional<String> checkName(String s) {
        return (s == null || s.isEmpty()) ? Optional.empty() : Optional.of(s);
    }
}
