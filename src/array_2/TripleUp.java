package array_2;

public class TripleUp {
    public boolean tripleUp(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (Math.abs(nums[i] - nums[i + 1]) == Math.abs(nums[i + 1] - nums[i + 2]) && nums[i] < nums[i + 1] && nums[i + 1] < nums[i + 2])
                return true;
        }
        return false;
    }
}
