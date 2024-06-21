package array_2;

public class CenteredAverage {
    public int centeredAverage(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int e : nums) {
            sum += e;
            max = Math.max(max, e);
            min = Math.min(min, e);
        }
        return (sum - min - max) / (nums.length - 2);
    }
}
