import java.util.Arrays;

public class insertionFirst {
    public static void main(String[] args) {
        // Initial array with extra space for future insertions
        int[] arr = new int[10];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        arr[5] = 6;
        int size = 6; // Keep track of current elements

        int value = 20;

        size = insertAtFirst(arr, value, size); // Insert at first position
        System.out.println("Array after insertion: " + Arrays.toString(Arrays.copyOf(arr, size)));
    }

    // Insert the element at the first position
    public static int insertAtFirst(int[] arr, int value, int size) {
        // Check if the array has space for new element
        if (size >= arr.length) {
            System.out.println("Array is full, cannot insert new element.");
            return size;
        }

        // Shift elements to the right
        for (int i = size; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        // Insert the new value at the start
        arr[0] = value;

        // Increase size after insertion
        return size + 1;
    }
}
