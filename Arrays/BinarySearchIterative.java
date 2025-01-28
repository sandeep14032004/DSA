import java.util.*;

public class BinarySearchIterative {

    public static int binarySearch(int[] arr, int item) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // To avoid potential overflow

            if (arr[mid] == item) {
                return mid; // Item found
            } else if (arr[mid] < item) {
                low = mid + 1; // Search in the right half
            } else {
                high = mid - 1; // Search in the left half
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

        int result = binarySearch(arr, item);

        if (result == -1) {
            System.out.println(item + " not found.");
        } else {
            System.out.println(item + " found at index: " + result);
        }

        sc.close();
    }
}
