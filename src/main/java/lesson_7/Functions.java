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
}
