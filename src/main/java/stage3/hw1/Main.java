package stage3.hw1;

public class Main {
    public static void main(String[] args) {
        System.out.println(gcd(6, 2));
        System.out.println(gcd(1, 3));
        System.out.println(gcd(3, 6));
        System.out.println(gcd(3, 7));
        System.out.println(gcd(1, 1));
        System.out.println(gcd(4, 6));
    }

    public static int gcd(int a, int b) {
        while (b > 0) {
            int c = a % b;
            a = b;
            b = c;
        }
        return a;
    }
}
