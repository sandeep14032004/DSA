public class ReverseArrayUsingOnePointer {

    public static void Reverse(int i, int a[], int n) {
        if (i >= n / 2) {
            return;
        }
        int temp = a[i];
        a[i] = a[n - i - 1];
        a[n - i - 1] = temp;
        Reverse(i + 1, a, n);
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 2 };
        int n = a.length;
        Reverse(0, a, n);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
