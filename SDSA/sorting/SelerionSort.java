public class SelerionSort {
    public static int[] selection(int arr[]) {
        int n = arr.length;
        for (int i = 0; i <= n - 2; i++) {
            int min = i;
            for (int j = i + 1; j <= n - 1; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 3452, 2, 4, 21, 3, 3, 22, 26, 56, 5, 3, 452, 3 };
        int result[] = selection(arr);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
