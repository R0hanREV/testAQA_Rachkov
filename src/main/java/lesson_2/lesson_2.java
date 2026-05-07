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
        boolean i = a >=0;
        return i;
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


    }
}
