package stage5.hw5;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String fileName = "dataset_91069.txt";
        URL resource = Main.class.getClassLoader().getResource(fileName);
        assert resource != null;

        File file = new File(resource.getFile());

        try (Scanner scanner = new Scanner(file)) {
            scanner.nextLine(); // skip header

            String biggestDiffYear = "";
            long biggestDiff = 0;

            scanner.next();  // skip year name
            long previousPopulation = scanner.nextLong();

            while (scanner.hasNext()) {
                String year = scanner.next();
                long population = scanner.nextLong();

                if (population - previousPopulation > biggestDiff) {
                    biggestDiffYear = year;
                    biggestDiff = population - previousPopulation;
                }

                previousPopulation = population;
            }

            System.out.println(biggestDiffYear);
        } catch (FileNotFoundException e) {
            System.err.println(fileName + " was not found");
            System.exit(1);
        }
    }
}
