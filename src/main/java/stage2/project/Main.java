package stage2.project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();
        int key = scanner.nextInt();

        StringBuilder cipherText = new StringBuilder();

        for (char c : message.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                c = (char) ((c - 97 + key) % 26 + 97);
            }
            cipherText.append(c);
        }

        System.out.println(cipherText);
    }
}
