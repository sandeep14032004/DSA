public class SecondLargestNumberOptimal {
    public static int secondLargest(int arr[]) {
        if (arr.length < 2)
            return -1;

        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }

        return (secondLargest == Integer.MIN_VALUE) ? -1 : secondLargest;
    }

    public static void main(String[] args) {
        int arr[] = { -1, -2, -3, -4 };
        int result = secondLargest(arr);
        if (result == -1) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println("Second largest element is: " + result);
        }
    }
}
