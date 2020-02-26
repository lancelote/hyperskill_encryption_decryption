package stage5.hw6;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String fileName = "dataset_91022.txt";
        URL resource = Main.class.getClassLoader().getResource(fileName);
        assert resource != null;

        File file = new File(resource.getFile());

        try (Scanner scanner = new Scanner(file)) {
            int result = 0;

            while (scanner.hasNext()) {
                if (scanner.nextInt() > 9999) {
                    result += 1;
                }
            }

            System.out.println(result);
        } catch (FileNotFoundException e) {
            System.err.println(fileName + " not found");
            System.exit(1);
        }
    }
}
