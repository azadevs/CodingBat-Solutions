package array_2;

public class ModThree {
    public boolean modThree(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (i != nums.length - 2 && nums[i] % 2 == 0 && nums[i + 1] % 2 == 0 && nums[i + 2] % 2 == 0) return true;
            if (i != nums.length - 2 && nums[i] % 2 == 1 && nums[i + 1] % 2 == 1 && nums[i + 2] % 2 == 1) return true;
        }
        return false;
    }
}
