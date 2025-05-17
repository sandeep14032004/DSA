public class ReversearrayWithLandRPointer {
    static int[] a;

    public static void Reverse(int l, int r) {
        if (l >= r) {
            return;
        }
        int temp = a[l];
        a[l] = a[r];
        a[r] = temp;
        Reverse(l + 1, r - 1);
    }

    public static void main(String[] args) {
        a = new int[] { 1, 2, 3, 4, 2 };
        Reverse(0, a.length - 1);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
