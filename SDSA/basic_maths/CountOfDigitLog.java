public class CountOfDigitLog {
    public static void main(String[] args) {
        int n = 123456;
        int count = (int) Math.log10(n) + 1;
        System.out.println("Number of Digits in " + n + " is " + count);
    }
}
