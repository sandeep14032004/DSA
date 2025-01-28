import java.util.Scanner;

public class ArrayManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array with 10 elements and current size tracker
        int[] arr = new int[10]; // larger size array for insertions
        int size = 5; // assume initial size of 5 elements

        // Initializing array with some values
        for (int i = 0; i < size; i++) {
            arr[i] = i + 1;
        }

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Insert Element");
            System.out.println("2. Delete Element");
            System.out.println("3. Update Element");
            System.out.println("4. Display Array");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // Insert Element
                    System.out.print("Enter position (0 to " + size + "): ");
                    int positionInsert = sc.nextInt();
                    if (positionInsert > size || positionInsert < 0 || size >= arr.length) {
                        System.out.println("Invalid position or array is full.");
                    } else {
                        System.out.print("Enter value to insert: ");
                        int valueInsert = sc.nextInt();

                        // Shift elements to the right
                        for (int i = size; i > positionInsert; i--) {
                            arr[i] = arr[i - 1];
                        }

                        // Insert the value
                        arr[positionInsert] = valueInsert;
                        size++; // Increase array size after insertion
                        System.out.println("Element inserted successfully.");
                    }
                    break;

                case 2:
                    // Delete Element
                    System.out.print("Enter position (0 to " + (size - 1) + "): ");
                    int positionDelete = sc.nextInt();
                    if (positionDelete >= size || positionDelete < 0) {
                        System.out.println("Invalid position.");
                    } else {
                        // Shift elements to the left
                        for (int i = positionDelete; i < size - 1; i++) {
                            arr[i] = arr[i + 1];
                        }

                        // Decrease the size of the array
                        size--;
                        System.out.println("Element deleted successfully.");
                    }
                    break;

                case 3:
                    // Update Element
                    System.out.print("Enter position (0 to " + (size - 1) + "): ");
                    int positionUpdate = sc.nextInt();
                    if (positionUpdate >= size || positionUpdate < 0) {
                        System.out.println("Invalid position.");
                    } else {
                        System.out.print("Enter new value: ");
                        int valueUpdate = sc.nextInt();
                        arr[positionUpdate] = valueUpdate;
                        System.out.println("Element updated successfully.");
                    }
                    break;

                case 4:
                    // Display the array
                    System.out.print("Array elements: ");
                    for (int i = 0; i < size; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                    break;

                case 5:
                    // Exit the program
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice, please try again.");
                    break;
            }
        }
    }
}
