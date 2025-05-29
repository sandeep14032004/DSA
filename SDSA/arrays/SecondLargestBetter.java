public class SecondLargestBetter {

    public static int secondLargest(int arr[]) {
        int largest = Integer.MAX_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < largest) {
                if (secondLargest == -1 || secondLargest < arr[i]) {
                    secondLargest = arr[i];

                }
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 1, 8, 7, 12, 7, 9 };
        int slarge = secondLargest(arr);
        System.out.println(slarge);
    }
}