package stage3.hw2;

public class Calculator {

    private final CalculatorEngine engine;

    public Calculator(CalculatorEngine engine) {
        this.engine = engine;
    }

    public String divide(int a, int b) {
        String message;
        try {
            int result = engine.divide(a, b);
            message = String.format("Division of %s by %s = %s", a, b, result);
        } catch (ArithmeticException e) {
            message = "Division by zero is prohibited";
        }
        return message;
    }
}
