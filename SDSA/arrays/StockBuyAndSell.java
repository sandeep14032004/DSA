public class StockBuyAndSell {
    public static int Mareket(int arr[]) {
        int profit = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[j] - arr[i] > profit) {
                    profit = arr[j] - arr[i];
                }
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 1, 5, 3, 6, 4 };
        int res = Mareket(arr);
        System.out.println(res);
    }
}
