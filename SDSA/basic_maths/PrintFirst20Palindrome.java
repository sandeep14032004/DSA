public class PrintFirst20Palindrome {
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
        int count = 0;
        int num = 1;
        while (count < 20) {
            if (PalindromeCheck(num)) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }
}
