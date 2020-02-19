package stage2.hw7;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();

        int count = 0;

        for (int i = 0; i < word.length() - 1; i++) {
            if (word.charAt(i) == 'a' && word.charAt(i + 1) == 'b') {
                count += 1;
            }
        }

        System.out.println(count);
    }
}
