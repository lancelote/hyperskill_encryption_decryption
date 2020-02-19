package stage2.hw8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();

        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i) - word.charAt(i - 1) != 1) {
                System.out.println("false");
                return;
            }
        }

        System.out.println("true");
    }
}
