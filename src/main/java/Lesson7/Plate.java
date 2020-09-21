package Lesson7;


public class Plate {
    public int foodPlate;
    private int num;

    public Plate(int num, int foodPlate) {
        this.foodPlate = foodPlate;
        this.num = num;
    }

    public void decreaseFood(int n) {
        this.foodPlate -= n;
    }

    public void addFood(int n) {
        this.foodPlate += n;
    }

    public void info() {
        System.out.println("Plate " + this.num + ", food: " + this.foodPlate);
    }

}
