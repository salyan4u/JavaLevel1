package Lesson2;

public class Size8 {
    public static void main(String[] args) {
        int[] nums=new int[8];
        int value=0,i;
        for(i=0;i<nums.length;i++){
            nums[i]=value;
            value+=3;
        }
        for(i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
