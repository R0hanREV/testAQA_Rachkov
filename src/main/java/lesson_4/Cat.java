package lesson_4;

public class Cat extends Animal {
    private boolean isHungry;


    public Cat(String name) {
        super(name, 200, 0);
        this.isHungry = true;

    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }

    public void eat(Bowl bowl, int foodAmount) {
        if (isHungry == false){
            System.out.println(name+ " уже сыт.");
        }
        if (bowl.decreaseFood(foodAmount) >= foodAmount){
            isHungry = false;
            System.out.println(name + " поел "+ foodAmount + " еды.");
        } else {
            System.out.println("В миске не хватает еды");
        }
    }
}
