package Arrays;

public class insertionLast {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int value = 12;
        int newArray[] = InsertionLast(arr, value);
        for (int i : newArray) {
            System.out.println(i);
        }

    }

    public static int[] InsertionLast(int arr[], int value) {
        int[] newArray = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }
        newArray[arr.length] = value;
        return newArray;
    }

}
