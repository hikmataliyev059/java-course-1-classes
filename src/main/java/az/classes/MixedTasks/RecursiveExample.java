package az.classes.MixedTasks;

import java.util.Scanner;

public class RecursiveExample {

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = scanner.nextInt();
        int result = factorial(number);
        System.out.println("The factorial of " + number + " " + "is" + " " + result);
    }
}
