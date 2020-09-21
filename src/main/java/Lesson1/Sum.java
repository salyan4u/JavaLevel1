package Lesson1;

public class Sum {
    public static void main(String[] args) {
        int a=2,b=3,c=8,d=4;
        System.out.println("Result is: "+abcd(a,b,c,d));
    }
    public static int abcd(int x,int y,int z,int w) {
        int result=x * (y + (z / w));
        return result;
    }
}
