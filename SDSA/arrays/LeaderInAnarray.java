import java.util.ArrayList;

public class LeaderInAnarray {
    public static ArrayList<Integer> Leader(int arr[]) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            boolean isLeader = true;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    isLeader = false;
                    break;
                }
            }

            if (isLeader) {
                list.add(arr[i]);
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
