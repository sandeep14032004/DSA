public class PrintName {

    public static void printName(int count) {
        if (count == 0) {
            return;
        }
        System.out.println("Sandeep");
        printName(count - 1);
    }

    public static void main(String[] args) {
        printName(5);
    }
}
