package az.classes.Exception;

import java.util.Arrays;

public class GenericExample {

    public static void main(String[] args) {
        Object[] objects = {1, "A", true};
        System.out.println(Arrays.toString(objects));
        print(objects);
        Integer[] nums = {1, 2, 3};
        print(nums);
    }

//    public static void print(Object[] objects) {
//        for (Object object : objects) {
//            System.out.print(object + " ");
//        }                                     // eyni weydi amma altdaki daha spesifikdi yəni duzgundu
//        System.out.println();
//    }

    public static <E> void print(E[] data) {
        for (E obj : data) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }
}
