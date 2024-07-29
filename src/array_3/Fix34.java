package array_3;

public class Fix34 {
    public int[] fix34(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len - 1; i++) {
            if (nums[i] == 3) {
                for (int j = 0; j < len; j++) {
                    if (nums[j] == 4 && j != 0 && nums[j - 1] != 3) {
                        int temp = nums[i + 1];
                        nums[i + 1] = nums[j];
                        nums[j] = temp;
                    }
                }
            }
        }
        return nums;
    }
}
