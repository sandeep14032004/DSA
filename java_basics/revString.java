package java_basics;

import java.util.Scanner;

public class revString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sc.nextLine();
        String rev_str = new StringBuilder(str).reverse().toString();
        System.out.println("Reverse string is: " + rev_str);
    }
}
