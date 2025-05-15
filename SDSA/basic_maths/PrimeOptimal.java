public class PrimeOptimal {
    public static void main(String[] args) {
        int count = 0;
        int n = 24;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                count++;
                if (i != (n / i)) {
                    count++;
                }
            }
        }
        if (count > 2) {
            System.out.println("Not a Prime");
        } else {
            System.out.println("It is a Prime Number");
        }
    }
}
