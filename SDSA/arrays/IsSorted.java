public class IsSorted {
    public static boolean isSorted(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5 };
        int arr2[] = { 2, 1, 3, 5, 2, 1 };
        int arr3[] = { 1, 1, 2, 2, 3 };

        System.out.println(isSorted(arr1)); // true
        System.out.println(isSorted(arr2)); // false
        System.out.println(isSorted(arr3)); // true
    }
}
