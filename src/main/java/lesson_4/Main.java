package lesson_4;

public class Main {
    public static void main(String[] args) {
 //       Dog dog1 = new Dog("Bobik");
        Cat cat1 = new Cat("Murzik");
  //     cat1.run(150);
  //     cat1.swim(10);
    Bowl bowl1 = new Bowl();
    bowl1.setAmountOfFood(50);
    cat1.eat(bowl1, 10);
        System.out.println(bowl1.getAmountOfFood());

    }
}
