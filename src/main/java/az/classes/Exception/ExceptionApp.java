package az.classes.Exception;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionApp {

    public static void mainV1(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter(new File("src/main/java/Exception1/a.text"));
            fileWriter.write("Hello World");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Exceptions thrown...");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        String word1 = scanner.next();
        int num;
        int num1;

        try {
            num = Integer.parseInt(word);
            num1 = Integer.parseInt(word1);
            System.out.println(num / num1);
        } catch (RuntimeException e) {
            System.out.println("Error happen...");
        }
    }
}
