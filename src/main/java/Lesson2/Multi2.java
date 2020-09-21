package Lesson2;

public class Multi2 {
    public static void main(String[] args) {
        int i;
        int[] nums= { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (i=0;i<nums.length;i++){
            if (nums[i]<6) nums[i]*=2;
        }
        for(i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
