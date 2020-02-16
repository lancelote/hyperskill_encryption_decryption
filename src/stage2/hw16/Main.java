package stage2.hw16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();

        int middle = word.length() / 2;

        if (word.length() % 2 == 1) {
            System.out.println(word.substring(0, middle) + word.substring(middle + 1));
        } else {
            System.out.println(word.substring(0, middle - 1) + word.substring(middle + 1));
        }
    }
}
