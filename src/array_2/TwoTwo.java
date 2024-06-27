package array_2;

import java.util.Arrays;

public class TwoTwo {
    public boolean twoTwo(int[] nums) {
        if (nums.length == 1 && nums[0] == 2) return false;
        if (!Arrays.toString(nums).contains("2")) return true;
        boolean b = false;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 2) {
                if (nums[i - 1] == 2) {
                    b = true;
                    i++;
                } else {
                    b = false;
                }
            }
        }
        return b;
    }
}
