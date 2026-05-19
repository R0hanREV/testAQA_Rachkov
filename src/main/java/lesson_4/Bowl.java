package lesson_4;

public class Bowl {
    private int amountOfFood;


    public Bowl(int amountOfFood) {
        this.amountOfFood = amountOfFood;
    }

    public int getAmountOfFood() {
        return amountOfFood;
    }

    public void setAmountOfFood(int amountOfFood) {
        this.amountOfFood = amountOfFood;
    }

    public int addFood(int food) {
        if (amountOfFood < 0) {
            amountOfFood = 0;
        }
        return amountOfFood += food;
    }

    public int decreaseFood(int food) {
        if (amountOfFood < 0) {
            amountOfFood = 0;
        }
        return amountOfFood -= food;
    }
}