package lesson_5;

import lesson_5.Exceptions.MyArrayDataException;
import lesson_5.Exceptions.MyArraySizeException;

public class Main {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        String array[][] = {{"1", "2", "3", "4"},
                            {"5", "6", "7", "8"},
                            {"9", "10", "11", "12"},
                            {"13", "14", "15", "b"}};
        try {
            ArrayCheked.compareArray(array);
        } catch (MyArraySizeException e) {
            System.out.println("Размер массива должен быть 4х4");
        } catch (MyArrayDataException e) {
            System.out.println();
        }

    }
}
