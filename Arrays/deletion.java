package Arrays;

public class deletion {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int value = 3;
        int newArray[] = deleteValue(arr, value);
        for (int i : newArray) {
            System.err.println(i);
        }
    }

    public static int[] deleteValue(int[] arr, int value) {
        int pos = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                pos = i;
                break;
            }
        }
        if (pos == -1)
            return arr;
        return Deletion(arr, pos);
    }

    public static int[] Deletion(int arr[], int pos) {
        int[] newArray = new int[arr.length - 1];
        for (int i = 0; i < pos; i++) {
            newArray[i] = arr[i];

        }
        for (int i = pos + 1; i < arr.length; i++) {
            newArray[i - 1] = arr[i];

        }
        return newArray;
    }
}
