public class GCD_Euclidean {
    public static void Gcd(int a, int b) {
        while (a > 0 && b > 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
        }
        if (a == 0) {
            System.out.println(b);
        }

        else {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        Gcd(20, 15);
    }
}
