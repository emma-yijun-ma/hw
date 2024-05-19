public class App {
    public int longestPalindrome(String s) {
        int[] frequency = new int[128];
        for (char c : s.toCharArray()) {
            frequency[c]++;
        }

        int length = 0;
        boolean oddFound = false;

        for (int count : frequency) {
            length += count / 2 * 2;
            if (count % 2 == 1) {
                oddFound = true;
            }
        }
        return oddFound ? length + 1 : length;
    }
}
