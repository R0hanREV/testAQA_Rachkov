package lesson_7;

import java.util.Locale;

public class Functions {


    //   public boolean isPAlenfrom(String str) {
    //       String string = str.toLowerCase();
    //       String revers = new StringBuilder(string).reverse().toString();
    //       return string.equals(revers);
    //   }

    public long factorialCalc(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Число не должно быть отрицательным");
        }
        if (n == 0) {
            return 1;
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public double calcTriangle(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("Стороны треуголника должны быть больше нуля");
        }
        if ((a + b <= c) || (a + c <= b) || (b + c <= a)) {
            throw new IllegalArgumentException("Треугольник с такими сторонавми не существует");
        }
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль невозможно");
        }
        return (double) a / b;
    }

    public String compare(int a, int b) {
        if (a > b) {
            return "больше";
        }
        if (a < b) {
            return "меньше";
        } else {
            return "равно";
        }
    }
}

