package ap_1;

public class ScoresSpecial {
    public int scoresSpecial(int[] a, int[] b) {
        return findLargeSpecial(a) + findLargeSpecial(b);
    }

    public int findLargeSpecial(int[] arr) {
        int max = 0;
        for (int n : arr) {
            if (n % 10 == 0) {
                max = Math.max(max, n);
            }
        }
        return max;
    }
}
