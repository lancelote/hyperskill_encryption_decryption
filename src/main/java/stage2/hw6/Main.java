package stage2.hw6;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        StringBuilder stringBuilder = new StringBuilder(word);
        String reverseWord = stringBuilder.reverse().toString();
        System.out.println(word.equals(reverseWord) ? "yes" : "no");
    }
}
