public class PrimeBrute {
    public static boolean isPrime(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }

        }
        return count <= 2;
    }

    public static void main(String[] args) {
        int n = 9;
        if (isPrime(n)) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println("Not a Prime Number");
        }
    }
}
