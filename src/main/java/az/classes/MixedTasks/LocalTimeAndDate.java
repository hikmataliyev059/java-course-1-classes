package az.classes.MixedTasks;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalTimeAndDate {

    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        System.out.println("Cari tarix: " + currentDate);

        LocalTime currentTime = LocalTime.now();
        System.out.println("Cari vaxt: " + currentTime);

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Cari tarix və vaxt: " + currentDateTime);
    }
}
