package array_1;

import static base.Base.getArray;
import static base.Base.sc;

public class MaxTriple {
    public static void main(String[] args) {
        int n = sc.nextInt(); // Must be odd number like (3,5,9...)
        int[] nums = getArray(n);
        System.out.println(maxTriple(nums));
    }

    public static int maxTriple(int[] nums) {
        int first = nums[0];
        int middle = nums[nums.length / 2];
        int last = nums[nums.length - 1];

        return Math.max(first, Math.max(middle, last));
    }
}
