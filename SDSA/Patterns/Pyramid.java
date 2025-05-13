public class Pyramid {
    public static void main(String[] args) {
        for (int i = 0; i <= 4; i++) {

            for (int k = 0; k <= 4 - i; k++) {
                System.out.print(" ");
            }
            for (int l = 0; l <= (2 * i); l++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
