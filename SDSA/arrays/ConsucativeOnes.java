public class ConsucativeOnes {
    public static int Consucative(int arr[]) {
        int count = 0;
        int ConsOnes = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
                if (count > ConsOnes) {
                    ConsOnes = count;
                }
            } else {
                count = 0;
            }
        }
        return ConsOnes;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 1, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1 };
        System.out.println(Consucative(arr));
    }
}
