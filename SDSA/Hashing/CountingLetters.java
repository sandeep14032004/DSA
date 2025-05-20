public class CountingLetters {
    public static void main(String[] args) {
        String str = "abcdabbc";
        int[] hash = new int[26];

        for (int i = 0; i < str.length(); i++) {
            hash[str.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (hash[i] > 0) {
                System.out.println((char) (i + 'a') + " -> " + hash[i]);
            }
        }
    }
}
