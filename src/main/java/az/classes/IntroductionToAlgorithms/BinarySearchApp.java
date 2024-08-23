package az.classes.IntroductionToAlgorithms;

import java.util.Arrays;

public class BinarySearchApp {

    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 10, 40};

        int result = binarySearch(23, nums);
        System.out.println(result);
    }

    public static int binarySearch(int num, int[] nums) {
        return Arrays.binarySearch(nums, num);
    }

}
