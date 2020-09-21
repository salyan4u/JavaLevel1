package Lesson6;

public class Dog extends Animal {

    public Dog() {
        super(0.5f, 500, 10);
    }

    protected boolean run(int value) {
        return value <= this.canRun;
    }

    protected boolean jump(int value) {
        return !(value > canJump);
    }

    protected boolean swim(int value) {
        return value <= canSwim;
    }

    protected static class Shepherd extends Dog {

        public Shepherd() {
            this.canRun = 400;
        }

        public boolean run(int value) {
            return value <= this.canRun;
        }
    }

    protected static class Labrador extends Dog {

        public Labrador() {
            this.canRun = 600;
        }


        protected boolean run(int value) {
            return value <= this.canRun;
        }
    }
}
