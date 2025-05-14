public class ReversedPyramid {
    public static void main(String[] args) {
        int n = 5; // height of the pyramid

        for (int i = 0; i < n; i++) {
            // print spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // print stars
            for (int j = 0; j < 2 * (n - i) - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
