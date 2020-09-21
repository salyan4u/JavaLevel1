package Lesson2;

public class Equalparts {
    public static void main(String[] args) {
        int[] nums1={2,2,2,4,5,6,7,23,5};
        int[] nums2={2,2,2,4,5,6,7,23,4};
        int[] nums3={2,8};
        int[] nums4={1,1};
        System.out.println(func(nums1));
        System.out.println(func(nums2));
        System.out.println(func(nums3));
        System.out.println(func(nums4));
    }

    public static boolean func(int[] array){
        int leftsum=0,rightsum=0;
        for(int i=0;i<array.length;i++){
            leftsum+=array[i];
            for(int j=i+1;j<array.length;j++){
                rightsum+=array[j];
            }
            if (leftsum==rightsum){
                break;
            }
            else {
                rightsum=0;
                continue;
            }
        }
        if (leftsum==rightsum) return true;
        else return false;
    }
}
