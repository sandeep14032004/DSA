
public class selection {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 7, 8, 1, 2 };
        int SortedArr[] = Selection(arr);
        for (int i : SortedArr) {
            System.out.println(i + " ");
        }

    }

    public static int[] Selection(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < arr.length - 1; i++) {
            int minValue = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minValue] 2) {
                    minValue = j;
                }
            }
            int temp = arr[minValue];
            arr[minValue] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
