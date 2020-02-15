package stage2.hw1;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        StringBuilder result = new StringBuilder();

        for (char c : string.toCharArray()) {
            result.append(c);
            result.append(c);
        }

        System.out.println(result);
    }
}
