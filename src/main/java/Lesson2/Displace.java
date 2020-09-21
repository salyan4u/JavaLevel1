package Lesson2;

import java.util.Arrays;

public class Displace {
    public static void main(String[] args) {
        int[] nums = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        plus(nums, 6);
        int[] nums2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        plus(nums2, -2);
        int[] nums3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        plus(nums3, 2);
    }

    public static void plus(int[] array, int n) {
        if (n >= 0) {
            for (int i = array.length - 1; i > n - 1; i--) {
                array[i] = array[i - n];
            }
            for (int i = 0; i < n; i++) {
                array[i] = 0;
            }
            System.out.println(Arrays.toString(array));
        } else {
            n = Math.abs(n);
            for (int i = n; i < array.length; i++) {
                array[i - n] = array[i];
            }
            for (int i = array.length - 1; i > array.length - n - 1; i--) {
                array[i] = 0;
            }
            System.out.println(Arrays.toString(array));
        }
    }
}