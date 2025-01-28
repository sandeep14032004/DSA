public class ReverseArray {
    public static void main(String[] args) {
        // Define and initialize an array
        int[] arr = { 1, 2, 3, 4, 5 };

        // Display the original array
        System.out.print("Original Array: ");
        printArray(arr);

        // Reverse the array
        reverseArray(arr);

        // Display the reversed array
        System.out.print("Reversed Array: ");
        printArray(arr);
    }

    // Method to reverse the array in place
    public static void reverseArray(int[] arr) {
        int left = 0; // Start index
        int right = arr.length - 1; // End index

        // Loop until the left index is less than the right index
        while (left < right) {
            // Swap elements at the left and right indices
            int temp = arr[left]; // Temporarily store the left element
            arr[left] = arr[right]; // Assign the right element to the left position
            arr[right] = temp; // Assign the temporary stored value to the right position

            // Move the indices towards the center
            left++;
            right--;
        }
    }

    // Method to print the elements of the array
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " "); // Print each element followed by a space
        }
        System.out.println(); // New line after printing all elements
    }
}
