package Lesson7;


public class Cat extends Animal {

    public Cat(String name, int appetite, boolean satiety) {
        super(name, appetite, satiety);
    }


    public void info() {
        System.out.println("Кот: " + this.name + "; его аппетит: " + this.appetite + "; он сыт? " + this.satiety);
    }

    public void eat(Plate p) {
        if (this.appetite <= p.foodPlate) {
            System.out.println("Кот поел "+this.appetite +" еды.");
            p.decreaseFood(this.appetite);
            this.appetite = 0;
            this.satiety = true;
        }
    }

}