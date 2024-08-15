package az.classes.MixedTasks;


import java.util.UUID;

public class GenerateNumberApp {

    public static void main(String[] args) {
        GenerateNumber<Integer> resultBox = generateRandInt();
        System.out.println(resultBox.getData());
        System.out.println(resultBox.isEven());

        GenerateNumber<Double> resultBox1 = generateRandDouble();
        System.out.println(resultBox1.getData());
        System.out.println(resultBox1.isEven());

        GenerateNumber<String> resultBox2 = generateRandString();
        System.out.println(resultBox2.getData());
        System.out.println(resultBox2.isEven());
        System.out.println(resultBox2);

    }

    public static GenerateNumber<Integer> generateRandInt() {
        int num = (int) (Math.random() * 100);
        boolean isEven = num % 2 == 0;
        return new GenerateNumber<>(num, isEven);
    }

    public static GenerateNumber<Double> generateRandDouble() {
        double num = (Math.random() * 100);
        boolean isEven = num % 2 == 0;
        return new GenerateNumber<>(num, isEven);
    }

    public static GenerateNumber<String> generateRandString() {
        return new GenerateNumber<>(UUID.randomUUID().toString(), true);
    }
}
