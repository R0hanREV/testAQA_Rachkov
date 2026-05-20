package lesson_4;

public class Main {
    public static void main(String[] args) {
 //       Dog dog1 = new Dog("Bobik");
        Cat [] cat1 = new Cat[3];
        cat1[0] = new Cat("Murzik");
        cat1[1]= new Cat("Barsik");
        cat1[2] = new Cat("Begemot");
        //     cat1[0].run(150);
  //     cat1[0].swim(10);
    Bowl bowl1 = new Bowl();
    bowl1.setAmountOfFood(50);
    cat1.eat(bowl1, 10);
        System.out.println(bowl1.getAmountOfFood());

    }
}
