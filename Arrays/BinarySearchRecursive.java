import java.util.*;

public class BinarySearchRecursive {

    public static int binarySearch(int[] arr, int low, int high, int item) {
        if (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == item) {
                return mid; // Item found
            } else if (arr[mid] < item) {
                return binarySearch(arr, mid + 1, high, item); // Search in the right half
            } else {
                return binarySearch(arr, low, mid - 1, item); // Search in the left half
            }
        }
        return -1; // Item not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the sorted array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element to search:");
        int item = sc.nextInt();

        int result = binarySearch(arr, 0, n - 1, item);

        if (result == -1) {
            System.out.println(item + " not found.");
        } else {
            System.out.println(item + " found at index: " + result);
        }

        sc.close();
    }
}
