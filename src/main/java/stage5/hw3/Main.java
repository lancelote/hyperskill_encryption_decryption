package stage5.hw3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String filePath = "./src/main/java/stage5/hw3/dataset_91033.txt";
        File file = new File(filePath);
        int result = 0;

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                result += scanner.nextInt();
            }
        } catch (FileNotFoundException e) {
            System.err.println("no such file " + filePath);
        }

        System.out.println(result);
    }
}
