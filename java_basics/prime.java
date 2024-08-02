package java_basics;

import java.util.*;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number a check the number prime or not:");
        int n = sc.nextInt();
        if (prime_check(n)) {
            System.out.println(n + " is a prime number ");
        } else {
            System.out.println(n + " is not a prime number ");
        }
    }

    public static Boolean prime_check(int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                count++;
            }

        }
        if (count > 2) {
            return false;
        } else {
            return true;
        }
    }
}
