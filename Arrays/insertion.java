package Arrays;

import java.util.Scanner;

public class insertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the " + (i + 1) + " element of the array: ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Array before insertion: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("Enter the new value to be inserted: ");
        int value = sc.nextInt();
        System.out.print("Enter the position in which the new value is to be inserted (0-based index): ");
        int position = sc.nextInt();

        int[] newArray = arrayInsertion(arr, position, value);

        System.out.print("Array after insertion: ");
        for (int i : newArray) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int[] arrayInsertion(int[] arr, int position, int value) {
        if (position < 0 || position > arr.length) {
            System.out.println("Invalid position");
            return arr;
        }

        int[] newArray = new int[arr.length + 1];

        for (int i = 0; i < position; i++) {
            newArray[i] = arr[i];
        }

        newArray[position] = value;

        for (int i = position; i < arr.length; i++) {
            newArray[i + 1] = arr[i];
        }

        return newArray;
    }
}
