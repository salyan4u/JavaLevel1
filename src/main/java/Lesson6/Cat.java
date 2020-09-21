package Lesson6;

public class Cat extends Animal {

    public Cat() {
        super(2, 200, 0);
    }

    protected boolean run(int value) {
        return value <= this.canRun;
    }

    protected boolean jump(int value) {
        return value <= this.canJump;
    }

    @Override
    protected boolean swim(int value) {
        return false; //Кот не плавает
    }

}
