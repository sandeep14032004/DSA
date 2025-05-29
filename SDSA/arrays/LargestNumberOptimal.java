public class LargestNumberOptimal {
    public static int Largest(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 0, 23, 1 };
        int result = Largest(arr);
        System.out.println(result);
    }
}
