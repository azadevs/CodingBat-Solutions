package array_1;

import java.util.Arrays;

import static base.Base.getArray;
import static base.Base.sc;

public class MidThree {
    public static void main(String[] args) {
        int n = sc.nextInt(); // n will be at least 3
        int[] nums = getArray(n);
        System.out.println(Arrays.toString(midThree(nums)));
    }

    public static int[] midThree(int[] nums) {
        if (nums.length == 3) return nums;
        int mid = nums.length / 2;
        return new int[]{nums[mid - 1], nums[mid], nums[mid + 1]};
    }
}
