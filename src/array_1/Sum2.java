package array_1;

import static base.Base.getArray;
import static base.Base.sc;

public class Sum2 {
    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arr = getArray(n);
        System.out.println(sum2(arr));
    }

    public static int sum2(int[] nums) {
        int len = nums.length;
        if (len == 0) return 0;
        else if (len >= 2) return nums[0] + nums[1];
        else return nums[0];
    }
}
