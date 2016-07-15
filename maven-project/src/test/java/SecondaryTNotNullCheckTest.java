import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Andrey on 05.07.2016.
 */
public class SecondaryTNotNullCheckTest {
    @Test
    public void getSum() throws Exception {

        // Тестируемый класс
        Secondary tester = new Secondary();

        // Проверяемый метод
        assertNotNull("10 + 5 must be 15", tester.getSum(10, 5));
    }
}