
public class binarySearch {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int target = 2;
        int index = BinarySearch(arr, target);
        if (index == -1) {
            System.out.println(target + " is not found in the array");
        } else {
            System.out.println(target + " found at index : " + index);
        }
    }

    public static int BinarySearch(int arr[], int target) {
        int lb = 0;
        int ub = arr.length - 1;
        while (lb <= ub) {
            int mid = (lb + ub) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                lb = mid + 1;

            } else {
                ub = mid - 1;
            }
        }
        return -1;
    }
}
