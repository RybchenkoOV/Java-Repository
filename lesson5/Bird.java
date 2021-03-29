package lesson5;

public class Bird extends Animal{

    public Bird (String name, int abRun, int abSwim, float abJump) {
        super(name, abRun, abSwim, abJump);
    }

    void swim(int length) {
        System.out.println("Birds can't swim! The owl has drowned! You're an owl killer now! Now live with this!");
    }
}
