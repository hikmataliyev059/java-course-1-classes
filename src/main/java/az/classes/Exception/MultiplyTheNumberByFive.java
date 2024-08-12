package az.classes.Exception;

import java.util.Scanner;

public class MultiplyTheNumberByFive {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String str = scanner.next();
            try {
                int a = Integer.parseInt(str);
                System.out.println(a * 5);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Exception, Please try again..");
            }
        }
    }
}
