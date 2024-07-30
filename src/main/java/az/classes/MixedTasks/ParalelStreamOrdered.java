package az.classes.MixedTasks;

import java.util.Arrays;
import java.util.List;

public class ParalelStreamOrdered {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3);
        list.parallelStream().forEachOrdered(System.out::println);
    }
}
