package stage5.hw3;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String fileName = "dataset_91033.txt";
        URL resource = Main.class.getClassLoader().getResource(fileName);

        if (resource == null) {
            System.err.println(fileName + " was not found");
            System.exit(1);
        } else {
            File file = new File(resource.getFile());
            int result = 0;

            try (Scanner scanner = new Scanner(file)) {
                while (scanner.hasNext()) {
                    result += scanner.nextInt();
                }
            } catch (FileNotFoundException e) {
                System.err.println("no such file " + fileName);
            }

            System.out.println(result);
        }
    }
}
