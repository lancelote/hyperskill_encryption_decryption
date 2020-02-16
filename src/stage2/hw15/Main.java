package stage2.hw15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dna = scanner.next();

        int count = 1;
        char previous = dna.charAt(0);
        StringBuilder result = new StringBuilder();

        for (int i = 1; i < dna.length(); i++) {
            char current = dna.charAt(i);

            if (current == previous) {
                count += 1;
            } else {
                result.append(previous);
                result.append(count);
                previous = current;
                count = 1;
            }
        }

        result.append(dna.charAt(dna.length() - 1));
        result.append(count);

        System.out.println(result);
    }
}
