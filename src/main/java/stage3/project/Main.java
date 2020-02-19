package stage3.project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String mod = scanner.nextLine();
        String message = scanner.nextLine();
        int key = scanner.nextInt();

        switch (mod) {
            case "enc":
                String cipherText = encrypt(message, key);
                System.out.println(cipherText);
                break;
            case "dec":
                String plainText = decipher(message, key);
                System.out.println(plainText);
                break;
            default:
                System.out.println("unknown operation");
                break;
        }
    }

    private static String decipher(String message, int key) {
        StringBuilder plainText = new StringBuilder();

        for (char c : message.toCharArray()) {
            plainText.append((char) (c - key));
        }

        return plainText.toString();
    }

    private static String encrypt(String message, int key) {
        StringBuilder cipherText = new StringBuilder();

        for (char c : message.toCharArray()) {
            cipherText.append((char) (c + key));
        }

        return cipherText.toString();
    }
}
