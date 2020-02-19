package stage2.hw20;

import java.util.Scanner;

public class Main {
    private static final String VOWELS = "aeiouy";

    private static boolean areSame(int i, String word) {
        boolean c1 = VOWELS.contains(Character.toString(word.charAt(i - 2)));
        boolean c2 = VOWELS.contains(Character.toString(word.charAt(i - 1)));
        boolean c3 = VOWELS.contains(Character.toString(word.charAt(i)));

        return c1 && c2 && c3 || !c1 && !c2 && !c3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();

        int count = 0;
        for (int i = 2; i < word.length(); i += 1) {
            if (areSame(i, word)) {
                count += 1;
                i += 1;
            }
        }

        System.out.println(count);
    }
}
