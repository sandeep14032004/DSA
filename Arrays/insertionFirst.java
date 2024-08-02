package Arrays;

public class insertionFirst {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int value = 20;
        int newArray[] = InsertionFirst(arr, value);
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
    }

    public static int[] InsertionFirst(int arr[], int value) {
        int[] newArray = new int[arr.length + 1];
        newArray[0] = value;
        for (int i = 0; i < arr.length; i++) {
            newArray[i + 1] = arr[i];
        }
        return newArray;
    }
}
