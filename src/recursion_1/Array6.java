package recursion_1;

import static base.Base.getArray;
import static base.Base.sc;

public class Array6 {
    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arr = getArray(n);
        int index = sc.nextInt();
        System.out.println(array6(arr, index));
    }

    public static boolean array6(int[] nums, int index) {
        if (nums.length <= index) return false;
        return nums[index] == 6 || array6(nums, index + 1);
    }
}
