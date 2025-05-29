import java.util.Arrays;

public class LargestNumberBrute {

    public static int sort(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    public static void main(String[] args) {
        int arr[] = { 3, 4, 6, 2, 1, 4, 55, 2 };
        int largest = sort(arr);
        System.out.println(largest);
    }
}