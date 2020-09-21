package Lesson7;

public class Animal {

    public String name;
    public int appetite;
    public boolean satiety;

    public Animal(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public void eat(Plate p) {
        if (this.appetite <= p.foodPlate) {
            System.out.println(p.foodPlate);
            p.decreaseFood(this.appetite);
            this.appetite = 0;
            this.satiety = true;
            System.out.println("Животное поело "+p.foodPlate+" еды.");
        }
    }
}