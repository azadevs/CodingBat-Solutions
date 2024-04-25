package array_1;

import java.util.Arrays;

import static base.Base.getArray;

public class MaxEnd3 {
    public static void main(String[] args) {
        int[] arr = getArray(3);
        System.out.println(Arrays.toString(maxEnd3(arr)));
    }

    public static int[] maxEnd3(int[] nums) {
        return nums[0] > nums[2] ? new int[]{nums[0], nums[0], nums[0]} : new int[]{nums[2], nums[2], nums[2]};
    }
}
