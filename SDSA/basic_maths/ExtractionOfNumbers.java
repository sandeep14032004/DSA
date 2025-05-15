public class ExtractionOfNumbers {// also print in reverse order

    public static void main(String[] args) {
        int n = 1223;
        while (n != 0) {
            int remainder = n % 10;
            n = n / 10;
            System.out.print(remainder);
        }
    }
}