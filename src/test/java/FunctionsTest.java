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

    //    @DisplayName("Слово является палиндромом")
//    @ParameterizedTest
//    @ValueSource(strings = {"racecar", "radar", "able was I ere I saw elba"})
//    public void isPalindromeTest(String word) {
//        Assertions.assertTrue(functions.isPAlenfrom(word));
//    }
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
}
