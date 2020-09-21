package Lesson6;

public class AnimalsApp {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        System.out.println("Cat number one:");
        System.out.println("Jump:" + cat1.jump(3)); //false
        System.out.println("Run:" + cat1.run(100)); //true
        System.out.println("Swim:" + cat1.swim(10)); //false
        Cat cat2 = new Cat();
        System.out.println("Cat number two:");
        System.out.println("Jump:" + cat2.jump(1)); //true
        System.out.println("Run:" + cat2.run(300)); //false
        System.out.println("Swim:" + cat2.swim(10)); //false
        Dog dog = new Dog();
        System.out.println("Dog number one:");
        System.out.println("Jump:" + dog.jump(1)); //false
        System.out.println("Run:" + dog.run(700)); //false
        System.out.println("Swim:" + dog.swim(5)); //true
        Dog.Shepherd shepherd = new Dog.Shepherd();
        System.out.println("Shepherd:");
        System.out.println("Jump:" + shepherd.jump((int) 0.3f)); //true
        System.out.println("Run:" + shepherd.run(300)); //true
        System.out.println("Swim:" + shepherd.swim(5)); //true
        Dog.Labrador labrador = new Dog.Labrador();
        System.out.println("Labrador:");
        System.out.println("Jump:" + labrador.jump((int) 2.2f)); //false
        System.out.println("Run:" + labrador.run(700)); //false
        System.out.println("Swim:" + labrador.swim(10)); //true
    }
}
