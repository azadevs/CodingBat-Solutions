package array_1;

import java.util.Arrays;

import static base.Base.getArray;

public class Fix23 {
    public static void main(String[] args) {
        int[] arr = getArray(3);
        System.out.println(Arrays.toString(fix23(arr)));
    }

    public static int[] fix23(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2 && nums[i + 1] == 3) {
                nums[i + 1] = 0;
            }
        }
        return nums;
    }
}
