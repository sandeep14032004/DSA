public class RotateLeftByDindicesBrute {
    public static int[] Rotate(int arr[], int d) {
        int[] temp = new int[d];
        for (int index = 0; index < temp.length; index++) {
            temp[index] = arr[index];
        }
        for (int i = d; i < arr.length; i++) {
            arr[i - d] = arr[i];

        }
        for (int i = 0; i < d; i++) {
            arr[arr.length - d + i] = temp[i];
        }
        return arr;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        for (int i : Rotate(arr, 2)) {

            System.out.print(i + " ");
        }
    }
}
