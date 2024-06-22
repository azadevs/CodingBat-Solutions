package array_2;

public class Sum67 {
    public int sum67(int[] nums) {
        int sum = 0;
        boolean bool = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 6 && !bool) {
                sum += nums[i];
            }
            if (nums[i] == 6) {
                bool = true;
                i++;
            }
            if (nums[i] == 7) bool = false;
        }
        return sum;
    }
}
