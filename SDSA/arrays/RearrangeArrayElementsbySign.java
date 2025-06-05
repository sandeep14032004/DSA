public class RearrangeArrayElementsbySign {
    public static int[] Rearrange(int arr[]) {
        int n = arr.length;
        int[] res = new int[n];
        int posIndex = 0;
        int negIndex = 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                res[posIndex] = arr[i];
                posIndex = posIndex + 2;
            } else {
                res[negIndex] = arr[i];
                negIndex += 2;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, -3, -1, -2, 3 };
        int res[] = Rearrange(arr);
        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}
