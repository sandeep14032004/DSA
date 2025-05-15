import java.util.ArrayList;
import java.util.Collections;

public class PrintAllDivisorsOptimalTime {
    public static void Divisors(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
                if (n / i != i) {
                    list.add(n / i);
                }
            }
        }
        Collections.sort(list);
        for (int i : list) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Divisors(36);
    }
}
