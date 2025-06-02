import java.util.HashMap;

public class MajorityElement {
    public static int Majority(int arr[]) {
        int n = arr.length / 2;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int i : map.keySet()) {
            if (map.get(i) > n) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 2, 3, 3, 1, 2, 2 };
        int result = Majority(arr);
        if (result == -1) {
            System.out.println("There is no majority element");
        }
        System.out.println(result);
    }
}
