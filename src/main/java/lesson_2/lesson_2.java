package lesson_2;

public class lesson_2 {
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 4;
        int b = -6;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 71;
        if (value <= 0) {
            System.out.println("Касный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 5;
        int b = 9;
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }

    public static boolean compar(int a, int b) {
        int sum = a + b;
        boolean b1 = (sum >= 10) && (sum <= 20);
        return b1;
    }

    public static void estimationNum(int a) {
        if (a >= 0) {
            System.out.println("Число " + a + " положительное");
        } else {
            System.out.println("Число " + a + " отрицательное");
        }
    }

    public static boolean estNum(int a) {
        boolean i = a >= 0;
        return i;
    }

    public static void printWord(String a, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }

    public static boolean leapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void varArray() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < 10; i++) {
            if (array[i] == 0) {
                array[i] = 1;
                System.out.println(array[i]);
            } else {
                array[i] = 0;
                System.out.println(array[i]);
            }
        }
    }

    public static void largeArray() {
        int[] array = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = i + 1;
            System.out.println(array[i]);
        }
    }

    public static void doubleSixArray() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < 12; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
            System.out.print(array[i]);
        }
    }

    public static void crossArray() {
        int[][] array = new int[5][5];
        for (int i = 0; i < 5; i++) {
            array[i][i] = 1;
            for (int j = 0; j < 5; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }

    public static void manualArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
            System.out.print(array[i]);
        }
    }


    public static void main(String[] args) {
        printThreeWords();
        System.out.println();
        checkSumSign();
        System.out.println();
        printColor();
        System.out.println();
        compareNumbers();
        System.out.println();
        System.out.println(compar(6, 7));
        System.out.println();
        estimationNum(4);
        System.out.println();
        System.out.println(estNum(4));
        System.out.println();
        printWord("Слово", 3);
        System.out.println();
        System.out.println(leapYear(80));
        System.out.println();
        varArray();
        System.out.println();
        largeArray();
        System.out.println();
        doubleSixArray();
        System.out.println();
        System.out.println();
        crossArray();
        System.out.println();
        manualArray(3, 7);


    }
}