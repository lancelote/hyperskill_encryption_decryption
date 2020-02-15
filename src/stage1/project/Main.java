package stage1.project;

public class Main {
    public static void main(String[] args) {
        String message = "we found a treasure!";
        StringBuilder cipherText = new StringBuilder();

        for (char c : message.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                c = (char) (123 - (c - 96));
            }
            cipherText.append(c);
        }

        System.out.println(cipherText);
    }
}
