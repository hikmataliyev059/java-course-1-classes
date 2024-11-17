package az.classes.MixedTasks;

import java.util.Arrays;
import java.util.List;

public class ListOfVsArraysAsList {

    public static void main(String[] args) {
        String[] colorsArray = {"Red", "Green", "Blue"};
        List<String> colors = List.of(colorsArray);

        colorsArray[0] = "Yellow";

        System.out.println(colors.get(0).equals(colorsArray[0]));
        System.out.println(colors.get(1).equals(colorsArray[1]));
        System.out.println(colors.get(2).equals(colorsArray[2]));

        System.out.println();

        String[] colorsArray1 = {"Red", "Green", "Blue"};
        List<String> colors1 = Arrays.asList(colorsArray1);

        colors1.set(0, "Yellow");

        System.out.println(colors1.get(0).equals(colorsArray1[0]));
        System.out.println(colors1.get(1).equals(colorsArray1[1]));
        System.out.println(colors1.get(2).equals(colorsArray1[2]));
    }
}
