import java.util.ArrayList;

public class LeaderInAnarray {
    public static ArrayList<Integer> Leader(int arr[]) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            boolean leader = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i])
                    leader = false;

            }
            list.add(arr[i]);

        }
        return list;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 22, 12, 3, 0, 6 };
        int res[] = Leader(arr);
        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}
