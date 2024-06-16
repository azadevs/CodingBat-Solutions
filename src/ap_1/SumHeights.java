package ap_1;

public class SumHeights {
    public int sumHeights(int[] heights, int start, int end) {
        int sum = 0;
        for (int i = 0; i < heights.length - 1; i++) {
            if (i >= start && i + 1 <= end) {
                sum += Math.abs(heights[i] - heights[i + 1]);
            }
        }
        return sum;
    }
}
