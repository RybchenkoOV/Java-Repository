package lesson5;

public class Animal {

    protected int abRun; // переменные можно задить уровня protected, т.к. их получают только все наследники
    protected int abSwim;
    protected float abJump;
    protected String name;

    public Animal(String name, int abRun, int abSwim, float abJump) {
        this.name = name;
        this.abRun = rndRun(abRun); // изменяем стандартные значения, поступающие в конструктов с помощью рандомных модулей снизу
        this.abSwim = rndSwim(abSwim); // -//-
        this.abJump = rndJump(abJump); // -//-
    }

    protected void run(int length) {
        if (length <= this.abRun) {
            System.out.println("The " + name + " ran " + length + " meters.");
        }
        else {System.out.println("The distance is too long for the " + name);}
        }

    void swim(int length) {
        if (length <= this.abSwim) {
            System.out.println("The " + name + " swam " + length + " meters.");
        }
        else {System.out.println("The distance is too long for the " + name);}
        }

    protected void jump(float height) {
        if (height <= this.abJump) {
            System.out.println("The " + name + " jumped " + height + " meters high.");
        }
        else {System.out.println("It's too high for the " + name);}
        }

    /** Методы создающие случайные характеристики для животных */

    int rndRun(int length) {
        float newLength = length * (float)(Math.random()*1+1);
        return (int)newLength;
    }

    int rndSwim(int length) {
        float newLength = length * (float)(Math.random()*1+1);
        return (int)newLength;
    }

    float rndJump(float height) {
        float newHeight = height * (float)(Math.random()*1+1);
        return newHeight;
    }


}
