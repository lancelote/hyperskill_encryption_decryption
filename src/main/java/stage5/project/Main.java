package stage5.project;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String mode = "enc";
        String data = "";
        String outPath = "";
        int key = 0;

        for (int i = 0; i < args.length; i += 2) {
            switch (args[i]) {
                case "-mode":
                    mode = args[i + 1];
                    break;
                case "-key":
                    key = Integer.parseInt(args[i + 1]);
                    break;
                case "-in":
                    if (!data.equals("")) {
                        break;  // prefer "-data"
                    }

                    String fileName = args[i + 1];
                    File file = new File(fileName);
                    try (Scanner scanner = new Scanner(file)) {
                        data = scanner.nextLine();
                    } catch (FileNotFoundException e) {
                        System.err.println(fileName + " not found");
                        System.exit(1);
                    }
                    break;
                case "-data":
                    data = args[i + 1];
                    break;
                case "-out":
                    outPath = args[i + 1];
                    break;
                default:
                    System.err.println("unknown argument");
                    System.exit(1);
            }
        }

        switch (mode) {
            case "enc":
                String cipherText = encrypt(data, key);
                output(cipherText, outPath);
                break;
            case "dec":
                String plainText = decipher(data, key);
                output(plainText, outPath);
                break;
            default:
                System.err.println("unknown mod");
                System.exit(1);
        }
    }

    static void output(String message, String outPath) {
        if (outPath.equals("")) {
            System.out.println(message);
        } else {
            File file = new File(outPath);

            try (FileWriter writer = new FileWriter(file)) {
                writer.write(message);
            } catch (IOException e) {
                System.err.println("can't write to " + outPath);
                System.exit(1);
            }
        }
    }

    static String decipher(String message, int key) {
        StringBuilder plainText = new StringBuilder();

        for (char c : message.toCharArray()) {
            plainText.append((char) (c - key));
        }

        return plainText.toString();
    }

    static String encrypt(String message, int key) {
        StringBuilder cipherText = new StringBuilder();

        for (char c : message.toCharArray()) {
            cipherText.append((char) (c + key));
        }

        return cipherText.toString();
    }
}
