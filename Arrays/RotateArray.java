import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user for the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        // Create an array of size 'n'
        int[] arr = new int[n];

        // Populate the array with elements
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " + (i + 1) + " of the array: ");
            arr[i] = sc.nextInt();
        }

        // Get user input for rotation direction and positions
        System.out.print("Enter 0 for left rotation or 1 for right rotation: ");
        int direction = sc.nextInt();
        System.out.print("Enter the number of positions to rotate (k): ");
        int k = sc.nextInt();

        // Perform the rotation
        if (direction == 0) {
            // Left rotation
            rotateLeft(arr, k);
        } else if (direction == 1) {
            // Right rotation
            rotateRight(arr, k);
        } else {
            System.out.println("Invalid direction entered.");
            sc.close();
            return;
        }

        // Display the rotated array
        System.out.print("Rotated array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Close the Scanner resource
        sc.close();
    }

    // Method to rotate the array to the left by k positions
    public static void rotateLeft(int[] arr, int k) {
        int n = arr.length;
        // Normalize k in case it's greater than the length of the array
        k = k % n; // Handle cases where k > n

        // Perform the rotation
        reverse(arr, 0, n - 1); // Reverse the entire array
        reverse(arr, 0, n - k - 1); // Reverse the first part
        reverse(arr, n - k, n - 1); // Reverse the second part
    }

    // Method to rotate the array to the right by k positions
    public static void rotateRight(int[] arr, int k) {
        int n = arr.length;
        // Normalize k in case it's greater than the length of the array
        k = k % n; // Handle cases where k > n

        // Perform the rotation
        reverse(arr, 0, n - 1); // Reverse the entire array
        reverse(arr, 0, k - 1); // Reverse the first k elements
        reverse(arr, k, n - 1); // Reverse the remaining elements
    }

    // Method to reverse a portion of the array
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            // Swap elements at start and end
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
