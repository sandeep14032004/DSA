public class MissingNumber {

    public static int Missing(int arr[], int n) {
        int totalSum = (n * (n + 1)) / 2;
        int arraySum = 0;
        for (int i : arr) {
            arraySum += i;
        }
        return totalSum - arraySum;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5, 6 };
        int n = 6;
        System.out.println(Missing(arr, n));
    }
}