package lesson_5;

import lesson_5.Exceptions.MyArrayDataException;
import lesson_5.Exceptions.MyArraySizeException;

import java.util.SortedMap;

public class ArrayCheked {
    static void compareArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < 4; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException();
            }
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    int x = Integer.parseInt(array[i][j]);
                    sum = sum + x;
                } catch (NumberFormatException e) {
                    System.out.println("Неверный формат данных в ячейке [" + i + "][" + j + "]: " + array[i][j]);
                    throw new MyArrayDataException();
                }
            }
        }
        System.out.println("Сумма всех значений в массиве " + sum);
    }
}
