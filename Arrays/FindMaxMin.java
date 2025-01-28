public class FindMaxMin {
    public static int FindMax(int[] arr) {
        int Max = arr[0];
        for (int i : arr) {
            if (i > Max) {
                Max = i;
            }
        }
        return Max;
    }

    public static int FindMin(int[] arr) {
        int Min = arr[0];
        for (int i : arr) {
            if (i < Min) {
                Min = i;
            }
        }
        return Min;
    }

    public static void main(String[] args) {
        int arr[] = { 100, 12, 22, 9, 5, 1, 20, -3 };
        int min = FindMin(arr);
        int max = FindMax(arr);
        System.out.println("max element is : " + max + "\nmin element is : " + min);
    }
}
