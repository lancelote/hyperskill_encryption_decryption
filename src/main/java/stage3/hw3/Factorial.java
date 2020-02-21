package stage3.hw3;

public class Factorial {
    public long get(int x) {
        if (x < 0) {
            return -1;
        }

        int result = 1;
        for (int i = 1; i < x + 1; i++) {
            result *= i;
        }
        return result;
    }
}
