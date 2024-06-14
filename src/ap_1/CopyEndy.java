package ap_1;

public class CopyEndy {
    public int[] copyEndy(int[] nums, int count) {
        int[] res = new int[count];
        int j = 0;
        for (int n : nums) {
            if (isEndy(n) && j < res.length) res[j++] = n;
        }
        return res;
    }

    public boolean isEndy(int n) {
        return n >= 0 && n <= 10 || n >= 90 && n <= 100;
    }
}
