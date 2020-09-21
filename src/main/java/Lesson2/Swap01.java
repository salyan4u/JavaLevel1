package Lesson2;

public class Swap01 {
    public static void main(String[] args) {
        int[] nums={1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int i;
        for(i=0;i<nums.length;i++){
            if (nums[i]==1) nums[i]=0;
            else if(nums[i]==0) nums[i]=1;
        }
        for(i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
