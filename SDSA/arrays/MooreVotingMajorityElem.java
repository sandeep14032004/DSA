public class MooreVotingMajorityElem {
    public static int majorVote(int arr[]) {
        int count = 0;
        int element = 0;

        for (int i : arr) {
            if (count == 0) {
                element = i;
                count = 1;
            } else if (element == i) {
                count++;
            } else {
                count--;
            }
        }

        count = 0;
        for (int i : arr) {
            if (i == element) {
                count++;
            }
        }

        if (count > arr.length / 2) {
            return element;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 2, 3, 3, 1, 2, 2 };
        int result = majorVote(arr);
        System.out.println(result);
    }
}
