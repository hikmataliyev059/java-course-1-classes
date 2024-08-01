package az.classes.PassingValues.PassingByValue;

public class PassingByValue {

    public static void main(String[] args) {
        int num = 5;
        modifyValue(num);
        System.out.println("num inside the main method: " + num);
    }

    public static void modifyValue(int number) {
        number = 10;
        System.out.println("number inside the modifyValue method: " + number);
    }
}
