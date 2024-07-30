package az.classes.Exception;

import java.util.Scanner;

public class CustomExceptionApp {

    public static void mainV1(String[] args) {
        int age = new Scanner(System.in).nextInt();
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("Invalid age!");
        }
        System.out.println(age);
    }

    public static void main(String[] args) {
        int age = new Scanner(System.in).nextInt();
        validateAge(age);
        System.out.println(age);
    }

    private static void validateAge(int age) throws InvalidAgeException, ArithmeticException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("Invalid age!");
        }
    }
}

