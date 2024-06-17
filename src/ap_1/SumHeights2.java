package ap_1;

public class SumHeights2 {
    public int sumHeights2(int[] heights, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            if (heights[i] < heights[i + 1]) {
                sum += 2 * (heights[i + 1] - heights[i]);
            } else {
                sum+=heights[i]-heights[i+1];
            }
        }
        return sum;
    }
}
