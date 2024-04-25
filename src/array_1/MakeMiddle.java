package array_1;

import java.util.Arrays;

import static base.Base.getArray;
import static base.Base.sc;

public class MakeMiddle {
    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] nums = getArray(n);
        System.out.println(Arrays.toString(makeMiddle(nums)));
    }

    public static int[] makeMiddle(int[] nums) {
        int middle = nums.length / 2;
        return new int[]{nums[middle - 1], nums[middle]};
    }
}
