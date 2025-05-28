public class BubbleSort {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int[] bubbleS(int arr[]) {
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 2, 8, 1, 3, 4 };
        int result[] = bubbleS(arr);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
