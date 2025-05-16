public class GCD_Brute {
    public static int gcd(int a, int b) {
        int gcd = 1;
        for (int i = Math.min(a, b); i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
                break;
            }
        }
        return gcd;
    }

    public static void main(String[] args) {
        System.out.println("GCD is: " + gcd(36, 60)); // Output: 12
    }
}
