package stage2.hw3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        int maxLength = 0;
        char previousChar = ' ';
        int currentLength = 0;

        for (char currentChar : word.toCharArray()) {
            if (currentChar == previousChar) {
                currentLength += 1;
            } else {
                currentLength = 1;
            }

            if (currentLength > maxLength) {
                maxLength = currentLength;
            }

            previousChar = currentChar;
        }

        System.out.println(maxLength);
    }
}
