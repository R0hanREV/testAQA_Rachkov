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

    public void addFood (int food) {
       amountOfFood += food;
    }

}
