package array_3;

public class Fix45 {
    public int[] fix45(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len - 1; i++) {
            if (nums[i] == 4) {
                for (int j = 0; j < len; j++) {
                    if (nums[j] == 5) {
                        if (j != 0 && nums[j - 1] != 4) {
                            int temp = nums[i + 1];
                            nums[i + 1] = nums[j];
                            nums[j] = temp;
                        } else if (j == 0) {
                            int temp = nums[i + 1];
                            nums[i + 1] = nums[j];
                            nums[j] = temp;
                        }
                    }
                }
            }
        }
        return nums;
    }
}
