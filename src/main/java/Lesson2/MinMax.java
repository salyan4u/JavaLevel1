package Lesson2;

public class MinMax {
    public static void main(String[] args) {
        int i,min,max;
        int[] nums= { 2, 5, 3, 2, 11, 4, 5, 2, 4,1, 8, 9 };
        min=nums[0];
        max=nums[0];
        for (i=0;i<nums.length;i++){
            if(min>nums[i]) min=nums[i];
        }
        System.out.println("Минимальное значение массива: "+min);

        for (i=0;i<nums.length;i++){
            if(max<nums[i]) max=nums[i];
        }
        System.out.println("Максимальное значение массива: "+max);
    }
}
