import java.util.ArrayList;

public class LeaderInAnarrayOptimize {
    public static ArrayList<Integer> Leader(int arr[]) {
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        int leader = arr[n - 1];
        int maxElement = leader;
        list.add(leader);
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxElement) {
                maxElement = arr[i];
                leader = maxElement;
                list.add(leader);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 22, 12, 3, 0, 6 };
        ArrayList<Integer> res = Leader(arr);
        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}
