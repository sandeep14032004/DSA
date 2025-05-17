public class SumofNnumbers {
    public static int Sum(int n) {
        if (n == 0)
            return 0;
        return n + Sum(n - 1);
    }

    public static void main(String[] args) {
        int n = 3;
        int sum = Sum(n);
        System.out.println(sum);
    }
}