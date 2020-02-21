package stage3.hw2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

public class CalculatorTest {

    @Mock
    private final CalculatorEngine engine = Mockito.mock(CalculatorEngine.class);

    private final Calculator calculator = new Calculator(engine);

    @Test
    public void testDivideCase01() {
        Mockito.when(engine.divide(0, 1)).thenReturn(0);
        assertEquals("Division of 0 by 1 = 0", calculator.divide(0, 1));
    }

    @Test
    public void testDivideCase11() {
        Mockito.when(engine.divide(1, 1)).thenReturn(1);
        assertEquals("Division of 1 by 1 = 1", calculator.divide(1, 1));
    }

    @Test
    public void testDivideCase12() {
        Mockito.when(engine.divide(1, 2)).thenReturn(0);
        assertEquals("Division of 1 by 2 = 0", calculator.divide(1, 2));
    }

    @Test
    public void testDivideCaseZeroDivider() {
        Mockito.when(engine.divide(1, 0)).thenThrow(new ArithmeticException());
        assertEquals("Division by zero is prohibited", calculator.divide(1, 0));
    }
}
