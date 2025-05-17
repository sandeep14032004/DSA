public class Factorial {
    public static int Facto(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * Facto(n - 1);
    }

    public static void main(String[] args) {
        int result = Facto(4);
        System.out.println(result);
    }
}
