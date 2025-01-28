import java.util.Scanner;

public class deletion {
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

        // Display the array before deletion
        System.out.print("Array before deletion: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Get the position to delete the element
        System.out.print("Enter the position of the element to be deleted (0-based index): ");
        int position = sc.nextInt();

        // Delete the element at the specified position
        int[] newArray = arrayDeletion(arr, position);

        // Display the array after deletion
        System.out.print("Array after deletion: ");
        for (int i : newArray) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Close the Scanner resource
        sc.close();
    }

    // Method to delete the element at the specified position
    public static int[] arrayDeletion(int[] arr, int position) {
        // Check if the position is valid
        if (position < 0 || position >= arr.length) {
            System.out.println("Invalid position");
            return arr; // Return the original array in case of invalid position
        }

        // Create a new array with one less slot after deletion
        int[] newArray = new int[arr.length - 1];

        // Copy elements before the deletion point
        for (int i = 0; i < position; i++) {
            newArray[i] = arr[i];
        }

        // Copy elements after the deletion point
        for (int i = position; i < newArray.length; i++) {
            newArray[i] = arr[i + 1];
        }

        // Return the new array
        return newArray;
    }
}
