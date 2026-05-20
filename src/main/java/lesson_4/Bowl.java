package lesson_4;

public class Bowl {
    private int amountOfFood;


    public Bowl() {
        this.amountOfFood = amountOfFood;
    }

    public int getAmountOfFood() {
        return amountOfFood;
    }

    public void setAmountOfFood(int amountOfFood) {
        this.amountOfFood = amountOfFood;
    }

    public void addFood(int food) {
        if (amountOfFood < 0) {
            amountOfFood = 0;
        }
        setAmountOfFood(amountOfFood += food);
    }

    public void decreaseFood(int food) {
        if (food <= amountOfFood) {
            setAmountOfFood(amountOfFood -= food);
        } else {
            System.out.println("В миске недостаточно еды");
        }
    }
}