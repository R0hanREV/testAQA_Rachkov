package lesson_4;

public class Cat extends Animal {
    private boolean isHungry;
    private int amountForFull;
    public Cat(String name, int amountForFull) {
        super(name, 200, 0);
        this.isHungry = true;
        this.amountForFull = amountForFull;
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }
    public void eat(Bowl bowl, int amountForFull) {
        if (amountForFull < bowl.getAmountOfFood()) {
            System.out.println(name+" поел из миски.");
            isHungry = false;
            bowl.setAmountOfFood(bowl.getAmountOfFood()-=amountForFull);


        }
    }
}