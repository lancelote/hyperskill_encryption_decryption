package stage2.hw17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] date = scanner.nextLine().split("-");

        int year = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int day = Integer.parseInt(date[2]);

        if (year == 0 || month < 1 || day < 1 || month > 12 || day > 31) {
            System.out.println("Incorrect input");
        } else {
            System.out.println(date[1] + "/" + date[2] + "/" + date[0]);
        }
    }
}
