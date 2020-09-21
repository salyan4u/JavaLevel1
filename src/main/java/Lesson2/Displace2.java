package Lesson2;

import java.util.Arrays;

public class Displace2 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        plus(nums, 4);
        int[] nums2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        plus(nums2, -3);
    }

    public static void plus(int[] array, int n) {
        int tmp, i;
        if (n >= 0) {
            for (i = array.length - 1; i > n - 1; i--) {
                tmp = array[i];
                array[i] = array[i - n];
                array[i - n] = tmp;
            }
            System.out.println(Arrays.toString(array));
        } else {
            n = Math.abs(n);
            for (i = n; i < array.length; i++) {
                tmp = array[i - n];
                array[i - n] = array[i];
                array[i] = tmp;
            }
            System.out.println(Arrays.toString(array));
        }
    }
}


