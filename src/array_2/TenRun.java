package array_2;

public class TenRun {
    public int[] tenRun(int[] nums) {
        int temp = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 == 0) {
                temp = nums[i];
            }
            if (temp != -1) {
                nums[i] = temp;
            }
        }
        return nums;
    }
}
