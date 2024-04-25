package array_1;

import java.util.Arrays;

import static base.Base.getArray;
import static base.Base.sc;

public class FrontPiece {
    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] nums = getArray(n);
        System.out.println(Arrays.toString(frontPiece(nums)));
    }

    public static int[] frontPiece(int[] nums) {
        if (nums.length < 2) return nums;
        return new int[]{nums[0], nums[1]};
    }
}
