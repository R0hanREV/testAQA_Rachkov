import lesson_7.Functions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class FunctionsTest {
    private Functions functions;

    @BeforeEach
    void SetUp() {
        functions = new Functions();
    }

    @Test
    @DisplayName("Поверка факториала 0")
    void testFactorialZero() {
        Assertions.assertEquals(1, functions.factorialCalc(0));
    }

    @ParameterizedTest
    @DisplayName("Проверка факториала числа")
    @CsvSource({"1,1", "2,2", "3,6", "4,24", "5,120"})
    void testFactorialNumber(int number, long value) {
        Assertions.assertEquals(value, functions.factorialCalc(number));
    }

    @Test
    @DisplayName("Проверка факториала отрицательного числа")
    void testFactorialNegativeNumber() {
        try {
            functions.factorialCalc(-3);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals("Число не должно быть отрицательным", e.getMessage());
        }
    }

    @ParameterizedTest
    @DisplayName("Проверка площади различных треуголников")
    @CsvSource({"3,3,3, 3.897114", "4,5,6,9.921567", "5,5,8, 12.0"})
    void testAreaTriangles(double a, double b, double c, double area) {
        Assertions.assertEquals(area, functions.calcTriangle(a, b, c), 0.0001);
    }

    @Test
    @DisplayName("Проверка площади треуголника с отрицательным значение стороны")
    void testTriangleWithInvalidSide() {
        try {
            functions.calcTriangle(-3, 4, 5);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals("Стороны треуголника должны быть больше нуля", e.getMessage());
        }
    }

    @Test
    @DisplayName("Проверка площади треуголника с отрицательным значение стороны")
    void testImpossibleTriangle() {
        try {
            functions.calcTriangle(4, 4, 9);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals("Треугольник с такими сторонавми не существует", e.getMessage());
        }
    }

    @Test
    @DisplayName("Проверка сложения положительных и отрицательных чисел")
    void testAddition() {
        Assertions.assertEquals(15, functions.add(10, 5));
        Assertions.assertEquals(-2, functions.add(3, -5));
    }

    @Test
    @DisplayName("Проверка вычитания чисел")
    void testSubtraction() {
        Assertions.assertEquals(5, functions.subtract(10, 5));
        Assertions.assertEquals(8, functions.subtract(3, -5));
    }

    @Test
    @DisplayName("Проверка умножения чисел")
    void testMultiplication() {
        Assertions.assertEquals(50, functions.multiply(10, 5));
        Assertions.assertEquals(-15, functions.multiply(3, -5));
    }

    @Test
    @DisplayName("Проверка деления чисел")
    void testDivision() {
        Assertions.assertEquals(2.0, functions.divide(6, 3), 0.001, "6 / 3 должно быть равно 2.0");
        Assertions.assertEquals(-2.0, functions.divide(-6, 3), 0.001, "-6 / 3 должно быть равно -2.0");
    }

    @Test
    @DisplayName("Проверка деления на ноль")
    void testDivisionException() {
        try {
            functions.divide(6, 0);
        } catch (ArithmeticException e) {
            Assertions.assertEquals("Деление на ноль невозможно", e.getMessage());
        }
    }

    @ParameterizedTest
    @CsvSource({"2,5,меньше", "5,3,больше", "10,10,равно"})
    void testCompareNumbers(int a, int b, String comp) {
        Assertions.assertEquals(comp, functions.compare(a, b));
    }
}