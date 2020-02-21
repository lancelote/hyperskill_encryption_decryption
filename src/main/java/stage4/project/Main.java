package stage4.project;

public class Main {
    public static void main(String[] args) {
        String mode = "enc";
        String data = "";
        int key = 0;

        for (int i = 0; i < args.length; i += 2) {
            switch (args[i]) {
                case "-mode":
                    mode = args[i + 1];
                    break;
                case "-key":
                    key = Integer.parseInt(args[i + 1]);
                    break;
                case "-data":
                    data = args[i + 1];
                    break;
                default:
                    System.err.println("unknown argument");
                    System.exit(1);
            }
        }

        switch (mode) {
            case "enc":
                String cipherText = encrypt(data, key);
                System.out.println(cipherText);
                break;
            case "dec":
                String plainText = decipher(data, key);
                System.out.println(plainText);
                break;
            default:
                System.err.println("unknown mod");
                System.exit(1);
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
