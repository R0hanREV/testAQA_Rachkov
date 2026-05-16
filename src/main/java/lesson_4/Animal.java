package lesson_4;

public class Animal {
    protected String name;
    protected int runDistance;
    protected int swimDistance;
    static int amountAnimals;

    public Animal(String name, int runDistance, int swimDistance) {
        this.name = name;
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;
        amountAnimals++;
    }

    public void run(int distance) {
        if (runDistance <= distance) {
            System.out.println(name + " пробежал " + distance + " метров.");
        }
        System.out.println(name + " не смог добежать"+ distance+ " метров.");

    }

    public void swim(int distance) {
        if (swimDistance <= distance) {
            System.out.println(name + " проплыл " + distance + " метров.");
        }
        System.out.println(name + " не смог проплыть" + " метров.");
    }
}
