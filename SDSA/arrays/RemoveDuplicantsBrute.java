import java.util.HashSet;

public class RemoveDuplicantsBrute {
    public static int removeD(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        int index = 0;
        for (int num : set) {
            arr[index++] = num;
        }

        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i] + " ");
        }

        return set.size();
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 1, 1, 2, 3, 4 };
        System.out.println("\nTotal unique elements: " + removeD(arr));
    }
}
