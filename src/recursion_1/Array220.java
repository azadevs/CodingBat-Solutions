package recursion_1;

import static base.Base.getArray;
import static base.Base.sc;

public class Array220 {
    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arr = getArray(n);
        System.out.println(array220(arr, 0));
    }

    public static boolean array220(int[] nums, int index) {
        if (nums.length <= index + 1 || nums.length <= 1) return false;
        return nums[index] * 10 == nums[index + 1] || array220(nums, index + 1);
    }
}
