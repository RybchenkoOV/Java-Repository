package lesson5;

public class TomCat extends Animal{

    public TomCat (String name, int abRun, int abSwim, float abJump) {
        super(name, abRun, abSwim, abJump);
    }

    void swim(int length) {
        System.out.println("Tom Cat doesn't like water. He won't swim!!!");
    }

}
