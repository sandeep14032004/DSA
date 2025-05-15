public class Palindrome {
    public static boolean PalindromeCheck(int n) {
        int reversedN = 0;
        int tempN = n;
        while (n != 0) {
            int lastD = n % 10;
            reversedN = (reversedN * 10) + lastD;
            n /= 10;
        }
        return tempN == reversedN;
    }

    public static void main(String[] args) {
        int n = 121;
        int n1 = 123;
        System.out.println(n + (PalindromeCheck(n) ? " is a Palindrome." : " is NOT a Palindrome."));
        System.out.println(n1 + (PalindromeCheck(n1) ? " is a Palindrome." : " is NOT a Palindrome."));

    }
}
