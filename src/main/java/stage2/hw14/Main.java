package stage2.hw14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dna = scanner.next();
        long count = dna.toLowerCase().chars().filter(x -> x == 'c' || x == 'g').count();
        double gc_content = (double) count / dna.length() * 100;
        System.out.println(gc_content);
    }
}
