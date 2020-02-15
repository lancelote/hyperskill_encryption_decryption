package stage2.hw10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        char letter = scanner.next().charAt(0);

        long result = string.chars().filter(x -> x == letter).count();
        System.out.println(result);
    }
}
