package Lesson1;

public class Plusminus {
    public static void main(String[] args) {
        int a=2,b=-2,c=0;
        System.out.println(comp(a));
        System.out.println(comp(b));
        System.out.println(comp(c));
    }
    public static String comp(int x){
        if(x>=0) return "Plus";
        else return "Minus";
    }
}
