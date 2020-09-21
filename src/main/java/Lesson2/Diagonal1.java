package Lesson2;

public class Diagonal1 {
    public static void main(String[] args) {
        int[][] nums=new int[4][4];
        int i,j;
        for (i=0;i<nums.length;i++){
            nums[i][i]=1;
        }
        for (i=0;i<nums.length;i++){
            for(j=0;j<nums[i].length;j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
    }
}
