package Lesson7;


public class AnimalsApp {
    public static void main(String[] args) {

        Cat cat1=new Cat("Лиза", 50, false);
        cat1.info();
        Plate plate1 =new Plate(1,100);
        plate1.info();
        cat1.eat(plate1);
        cat1.info();
        plate1.info();
        System.out.println();
        Cat cat2=new Cat("НеЛиза", 150, false);
        cat2.info();
        Plate plate2 =new Plate(2,100);
        plate2.info();
        cat2.eat(plate2);
        cat2.info();
        plate2.info();
        plate2.addFood(60);
        plate2.info();
        cat2.info();
        cat2.eat(plate2);
        cat2.info();
        plate2.info();
        System.out.println();
        Cat[] cats=new Cat[3];
        cats[0]=new Cat("Барсик", 150, false);
        cats[1]=new Cat("Вода", 100, false);
        cats[2]=new Cat("Огонь", 70, false);
        Plate plate3=new Plate(3,500);
        for (Cat cat : cats) {
            cat.info();
            cat.eat(plate3);
            plate3.info();
            cat.info();
        }
    }
}