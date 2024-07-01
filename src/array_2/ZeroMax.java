package array_2;

public class ZeroMax {
    public int[] zeroMax(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0) {
                int max = 0;
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] % 2 == 1 && max < nums[j]) {
                        max = nums[j];
                    }
                }
                nums[i] = max;
            }
        }
        return nums;
    }
}
