package stage2.hw2;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        int offset = scanner.nextInt();

        if (offset < word.length()) {
            System.out.println(word.substring(offset) + word.substring(0, offset));
        } else {
            System.out.println(word);
        }
    }
}
