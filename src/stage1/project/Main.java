package stage1.project;

public class Main {
    public static void main(String[] args) {
        String message = "we found a treasure!";
        StringBuilder cipherText = new StringBuilder();

        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            if (Character.isAlphabetic(c)) {
                c = (char) (123 - (c - 96));
            }
            cipherText.append(c);
        }

        System.out.println(cipherText);
    }
}
