public class StringPalindrome {
    public static boolean isPalindrome(String str, int i) {
        int n = str.length();
        if (i >= n / 2) {
            return true;
        }
        if (str.charAt(i) != str.charAt(n - i - 1)) {
            return false;
        }
        return isPalindrome(str, i + 1);
    }

    public static void main(String[] args) {
        String s1 = "sandeep";
        String s2 = "MADAM";
        System.out.println(isPalindrome(s1, 0));
        System.out.println(isPalindrome(s2, 0));
    }
}
