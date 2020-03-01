package stage6.project;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

abstract class Algorithm {

    abstract String encrypt(String message, int key);

    abstract String decipher(String message, int key);
}

class UnicodeAlgorithm extends Algorithm {

    public String encrypt(String message, int key) {
        StringBuilder cipherText = new StringBuilder();

        for (char c : message.toCharArray()) {
            cipherText.append((char) (c + key));
        }

        return cipherText.toString();
    }

    public String decipher(String message, int key) {
        return encrypt(message, -key);
    }
}

class ShiftAlgorithm extends Algorithm {

    public String encrypt(String message, int key) {
        StringBuilder plainText = new StringBuilder();

        for (char c : message.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                int shift = Character.isUpperCase(c) ? 65 : 97;
                plainText.append((char) (modulo(c - shift + key) + shift));
            } else {
                plainText.append(c);
            }
        }

        return plainText.toString();
    }

    public String decipher(String message, int key) {
        return encrypt(message, -key);
    }

    private static int modulo(int x) {
        return (x % 26 + 26) % 26;
    }
}

class Enigma {
    int key;
    String mode;
    String data;
    String outPath;
    Algorithm algorithm;

    public Enigma(int key, String mode, String data, String outPath, Algorithm algorithm) {
        this.key = key;
        this.mode = mode;
        this.data = data;
        this.outPath = outPath;
        this.algorithm = algorithm;
    }

    public void execute() {
        switch (this.mode) {
            case "enc":
                String cipherText = algorithm.encrypt(data, key);
                output(cipherText, outPath);
                break;
            case "dec":
                String plainText = algorithm.decipher(data, key);
                output(plainText, outPath);
                break;
            default:
                System.err.println("unknown mode");
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
}

// ToDo: simplify args processing?
public class Main {
    public static void main(String[] args) {
        String mode = "enc";
        String data = "";
        String outPath = "";
        Algorithm algorithm = null;
        int key = 0;

        for (int i = 0; i < args.length; i += 2) {
            switch (args[i]) {
                case "-alg":
                    switch (args[i + 1]) {
                        case "shift":
                            algorithm = new ShiftAlgorithm();
                            break;
                        case "unicode":
                            algorithm = new UnicodeAlgorithm();
                            break;
                        default:
                            System.err.println("unknown algorithm " + args[i + 1]);
                            System.exit(1);
                    }
                    break;
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

        Enigma enigma = new Enigma(key, mode, data, outPath, algorithm);
        enigma.execute();
    }
}
