package stage6.hw9;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class IntBinaryOperationTest {
    @Test
    void testAddition() {
        Addition addition = new Addition(1, 2);
        assertEquals(addition.perform(), 3);
    }

    @Test
    void testMultiplication() {
        Multiplication multiplication = new Multiplication(2, 3);
        assertEquals(multiplication.perform(), 6);
    }
}
