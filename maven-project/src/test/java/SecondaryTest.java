import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Andrey on 05.07.2016.
 */
public class SecondaryTest {
    @Test
    public void testMultiply() {
        // Тестируемый класс
        Secondary tester = new Secondary();

        // Проверяемый метод
        assertEquals("10 + 5 must be 15", 15, tester.getSum(10, 5));
    }
}
