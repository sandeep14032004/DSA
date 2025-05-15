public class PrintAllDivisorsBruteForce {
    public static void PrintDivisors(int n) {
        System.out.println("Divisors of " + n + " are ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        PrintDivisors(20);
    }
}
