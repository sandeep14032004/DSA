import java.util.Scanner;

public class Updation {
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

        // Display the array before update
        System.out.print("Array before update: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Get the position and new value to update the element
        System.out.print("Enter the position of the element to be updated (0-based index): ");
        int position = sc.nextInt();
        System.out.print("Enter the new value: ");
        int value = sc.nextInt();

        // Update the element at the specified position
        arrayUpdation(arr, position, value);

        // Display the array after update
        System.out.print("Array after update: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Close the Scanner resource
        sc.close();
    }

    // Method to update the element at the specified position
    public static void arrayUpdation(int[] arr, int position, int value) {
        // Check if the position is valid
        if (position < 0 || position >= arr.length) {
            System.out.println("Invalid position");
            return; // Do nothing if the position is invalid
        }

        // Update the element at the given position with the new value
        arr[position] = value;
    }
}
