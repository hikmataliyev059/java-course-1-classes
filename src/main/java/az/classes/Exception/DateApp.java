package az.classes.Exception;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Scanner;

public class DateApp {

    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String day = scanner.next();
            String month = scanner.next();
            String year = scanner.next();
            int day1;
            int month1;
            int year1;
            try {
                day1 = Integer.parseInt(day);
                month1 = Integer.parseInt(month);
                year1 = Integer.parseInt(year);

                LocalDate userBirthDate = LocalDate.of(year1, month1, day1);
                System.out.println(userBirthDate);
            } catch (DateTimeException | NumberFormatException e) {
                e.printStackTrace();
                System.out.println("error happen..");
            }
        }
    }
}
