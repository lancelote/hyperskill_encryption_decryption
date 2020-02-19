package stage2.hw4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ticket = scanner.next();

        int first = ticket.substring(0, 3).chars().map(Character::getNumericValue).sum();
        int second = ticket.substring(3).chars().map(Character::getNumericValue).sum();

        System.out.println(first == second ? "Lucky" : "Regular");
    }
}
