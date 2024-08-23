package az.classes.IntroductionToAlgorithms;

import java.util.Optional;
import java.util.Scanner;

public class LinearSearchApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[15];

        int n = scanner.nextInt();

        for (int i = 0; i < nums.length; i++) {
            nums[0] = (int) (Math.random() * 100);
            System.out.println(nums[i]);
        }

        System.out.println(checkArray(nums, n));
    }

    public static Optional<Integer> checkArray(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return Optional.of(i);
            }
        }
        return Optional.empty();
    }

}
