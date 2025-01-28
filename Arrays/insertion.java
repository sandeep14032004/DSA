import java.util.Scanner;

public class insertion {
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

        // Display the array before insertion
        System.out.print("Array before insertion: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Get the value to insert and the position to insert it
        System.out.print("Enter the new value to be inserted: ");
        int value = sc.nextInt();

        System.out.print("Enter the position in which the new value is to be inserted (0-based index): ");
        int position = sc.nextInt();

        // Insert the new value into the array at the specified position
        int[] newArray = arrayInsertion(arr, position, value);

        // Display the array after insertion
        System.out.print("Array after insertion: ");
        for (int i : newArray) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Close the Scanner resource
        sc.close();
    }

    // Method to insert the value at the specified position
    public static int[] arrayInsertion(int[] arr, int position, int value) {
        // Check if the position is valid
        if (position < 0 || position > arr.length) {
            System.out.println("Invalid position");
            return arr; // Return the original array in case of invalid position
        }

        // Create a new array with one extra slot for the new element
        int[] newArray = new int[arr.length + 1];

        // Copy elements before the insertion point
        for (int i = 0; i < position; i++) {
            newArray[i] = arr[i];
        }

        // Insert the new value at the specified position
        newArray[position] = value;

        // Copy the remaining elements after the insertion point
        for (int i = position; i < arr.length; i++) {
            newArray[i + 1] = arr[i];
        }

        // Return the new array
        return newArray;
    }
}
