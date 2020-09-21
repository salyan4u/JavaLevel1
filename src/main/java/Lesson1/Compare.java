package Lesson1;

public class Compare {
    public static void main(String[] args) {
        int a=2,b=22;
        System.out.println(comp(a,b));
        int c=8,d=5;
        System.out.println(comp(c,d));
    }

    public static boolean comp(int x,int y){
        if((x+y)>=10&&(x+y)<=20) return true;
        else return false;
    }
}