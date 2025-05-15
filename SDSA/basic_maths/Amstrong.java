public class Amstrong {
    public static int countDigit(int n) {
        int c = 0;
        while (n != 0) {
            c++;
            n /= 10;
        }
        return c;
    }

    public static boolean isAmstrong(int n) {
        int nDigit = countDigit(n);
        int temp = n;
        int not = 0;
        while (n != 0) {
            int lastDigit = (int) Math.pow((n % 10), nDigit);
            not += lastDigit;
            n /= 10;
        }
        return temp == not;
    }

    public static void main(String[] args) {
        int n = 153;
        int n1 = 111;
        int n2 = 9474;
        System.out.println(isAmstrong(n));
        System.out.println(isAmstrong(n1));
        System.out.println(isAmstrong(n2));
    }
}
