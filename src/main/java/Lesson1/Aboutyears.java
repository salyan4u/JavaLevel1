package Lesson1;

public class Aboutyears {
    public static void main(String[] args) {
        short a=1900;
        short b=1244;
        short c=2000;
        System.out.println(year(a));
        System.out.println(year(b));
        System.out.println(year(c));
    }
    public static String year(short x){
        if((x%4==0)&&((x%100!=0)||(x%400==0))) return x+" - leap year";
        else return x+" - not leap year";
    }

}
