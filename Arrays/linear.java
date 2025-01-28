import java.util.*;

public class linear {

    public static int Linear(int[] arr, int item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                return i;

            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("Enter how many numbers to store in the array : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " items to store in the array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("Entet the element to find  : ");
        int item = sc.nextInt();
        int result = Linear(arr, item);
        System.out.println(item + " found in :" + result + " index");
        sc.close();
    }
}
