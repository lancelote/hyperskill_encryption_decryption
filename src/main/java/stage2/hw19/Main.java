package stage2.hw19;

import java.util.Scanner;

public class Main {
    static String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static String LOWER = "abcdefghijklmnopqrstuvwxyz";
    static String DIGITS = "0123456789";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int upperCase = scanner.nextInt();
        scanner.nextInt();
        int digits = scanner.nextInt();
        int length = scanner.nextInt();

        StringBuilder password = new StringBuilder();

        for (int i = 0; i < upperCase; i++) {
            password.append(UPPER.charAt(i % 26));
        }

        for (int i = 0; i < digits; i++) {
            password.append(DIGITS.charAt(i % 10));
        }

        int lowerCount = 0;
        while (password.length() < length) {
            password.append(LOWER.charAt(lowerCount % 26));
            lowerCount += 1;
        }

        System.out.println(password);
    }
}
