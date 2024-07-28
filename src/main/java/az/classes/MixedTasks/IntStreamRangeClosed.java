package az.classes.MixedTasks;

import java.util.stream.IntStream;

public class IntStreamRangeClosed {

    public static void main(String[] args) {
        IntStream.rangeClosed(0, 10)
                .filter(value -> value % 2 == 0)
                .map(operand -> operand * 7)
                .forEach(System.out::println);
    }
}
