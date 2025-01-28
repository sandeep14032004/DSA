
import java.util.*;

public class basic {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many number to store in the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("The array is : ");
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + "\t");
        // }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
