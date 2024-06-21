package array_2;

public class BigDiff {
    public int bigDiff(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int e : nums) {
            max = Math.max(max, e);
            min = Math.min(min, e);
        }
        return max - min;
    }
}
