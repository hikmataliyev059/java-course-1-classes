package az.classes.MixedTasks;

import java.util.Arrays;

public class SortedArray {

    public static void main(String[] args) {
        int[] nums = {1, 6, -8, 16, 12};
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
