package Lesson6;

public class Animal {

    protected int canSwim, canRun;
    protected float canJump;

    protected Animal(float canJump, int canRun, int canSwim) {
        this.canJump = canJump;
        this.canRun = canRun;
        this.canSwim = canSwim;
    }

    protected boolean run(int value) {
        return false;
    }

    protected boolean swim(int value) {
        return false;
    }

    protected boolean jump(int value) {
        return false;
    }
}

