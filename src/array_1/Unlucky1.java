package array_1;

import java.util.Arrays;

import static base.Base.getArray;
import static base.Base.sc;

public class Unlucky1 {
    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arr = getArray(n);
        System.out.println(unlucky1(arr));
    }

    public static boolean unlucky1(int[] nums) {
        String str = Arrays.toString(nums);
        if (!(str.contains("1") && str.contains("3"))) return false;
        return nums[0] == 1 && nums[1] == 3 || nums[1] == 1 && nums[2] == 3 || nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3;
    }
}
