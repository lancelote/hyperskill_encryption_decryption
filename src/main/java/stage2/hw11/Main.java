package stage2.hw11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String substring = scanner.next();

        int count = 0;
        int i = 0;

        while (string.indexOf(substring, i) != -1) {
            count += 1;
            i = string.indexOf(substring, i) + substring.length();
        }

        System.out.println(count);
    }
}
