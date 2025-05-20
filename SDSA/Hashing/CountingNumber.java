public class CountingNumber {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 1, 1, 2, 4 };
        int[] freqA = new int[10];
        for (int i = 0; i < a.length; i++) {
            freqA[a[i]]++;
        }

        // System.out.println("Element : Frequency");
        // for (int i = 0; i < freqA.length; i++) {
        // if (freqA[i] > 0) {
        // System.out.println(i + " : " + freqA[i]);
        // }
        // }
        // let u r searching for 1 >>>>>>>>>>>>>how many times it occurs
        int n = 1;
        int count = freqA[n];
        System.out.println("1 occurs : " + count + " times");
    }
}
