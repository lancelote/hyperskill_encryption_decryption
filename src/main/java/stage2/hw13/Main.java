package stage2.hw13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        char c1 = scanner.next().charAt(0);
        char c2 = scanner.next().charAt(0);

        int count = 0;

        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i - 1) == c1 && word.charAt(i) == c2 || word.charAt(i - 1) == c2 && word.charAt(i) == c1) {
                count += 1;
            }
        }

        System.out.println(count);
    }
}
