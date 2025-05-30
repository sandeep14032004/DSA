public class LeftRotateByOnce {
    public static int[] rotateArr(int arr[]) {
        int first = arr[0];

        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }

        arr[arr.length - 1] = first;

        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        for (int i : rotateArr(arr)) {
            System.out.print(i + " ");
        }
    }
}
