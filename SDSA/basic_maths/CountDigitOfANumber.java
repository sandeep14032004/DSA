public class CountDigitOfANumber {
    public static void CountDigit(int n) {

        int count = 0;
        while (n != 0) {
            count++;
            n /= 10;
        }
        System.out.println("Numbers of Digits is : " + count);
    }

    public static void main(String[] args) {
        int n = 123456;
        CountDigit(n);
    }
}
