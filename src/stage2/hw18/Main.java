package stage2.hw18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] url = scanner.next().split("\\?");
        String[] parameters = url[1].split("&");
        String password = "";

        for (String item : parameters) {
            String[] parameter = item.split("=");
            System.out.println(parameter[0] + " : " + (parameter.length == 1 ? "not found" : parameter[1]));
            if (parameter[0].equals("pass")) {
                password = parameter[1];
            }
        }

        if (!password.isEmpty()) {
            System.out.println("password : " + password);
        }
    }
}
