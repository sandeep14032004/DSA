package java_basics;

public class rev_string {
    public static void main(String[] args) {
        String str = "sandeep";
        String rev_str = RevString(str);
        System.out.println("Reversed String is : " + rev_str);
    }

    public static String RevString(String str) {
        String rev_str = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev_str = rev_str + str.charAt(i);
        }
        return rev_str;
    }
}
