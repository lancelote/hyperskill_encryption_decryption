package stage5.hw7;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String fileName = "dataset_91007.txt";
        URL resource = Main.class.getClassLoader().getResource(fileName);
        assert resource != null;

        File file = new File(resource.getFile());

        try (Scanner scanner = new Scanner(file)) {
            int biggest = 0;

            while (scanner.hasNext()) {
                int next = scanner.nextInt();

                if (next > biggest) {
                    biggest = next;
                }
            }

            System.out.println(biggest);
        } catch (FileNotFoundException e) {
            System.err.println(fileName + " not found");
            System.exit(1);
        }
    }
}
