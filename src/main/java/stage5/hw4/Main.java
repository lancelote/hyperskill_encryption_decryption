package stage5.hw4;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String fileName = "dataset_91065.txt";
        URL resource = Main.class.getClassLoader().getResource(fileName);
        assert resource != null;

        File file = new File(resource.getFile());
        int result = 0;

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                int next = scanner.nextInt();
                if (next == 0) {
                    break;
                } else if (next % 2 == 0) {
                    result += 1;
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println(fileName + " was not found");
            System.exit(1);
        }

        System.out.println(result);
    }
}
