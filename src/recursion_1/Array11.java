package recursion_1;

import static base.Base.getArray;
import static base.Base.sc;

public class Array11 {
    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arr = getArray(n);
        System.out.println(array11(arr, 0));
    }

    public static int array11(int[] nums, int index) {
        if (nums.length <= index) return 0;
        return nums[index] == 11 ? 1 + array11(nums, index + 1) : array11(nums, index + 1);
    }
}
