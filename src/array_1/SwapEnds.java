package array_1;

import java.util.Arrays;

import static base.Base.getArray;
import static base.Base.sc;

public class SwapEnds {
    public static void main(String[] args) {
        int n = sc.nextInt(); // length will be at least 1
        int[] nums = getArray(n);
        System.out.println(Arrays.toString(swapEnds(nums)));
    }

    public static int[] swapEnds(int[] nums) {
        if (nums.length == 1) return nums;
        int a = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = a;
        return nums;
    }
}
