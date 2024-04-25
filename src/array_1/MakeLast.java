package array_1;

import java.util.Arrays;

import static base.Base.getArray;
import static base.Base.sc;

public class MakeLast {
    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] nums = getArray(n);
        System.out.println(Arrays.toString(makeLast(nums)));
    }

    public static int[] makeLast(int[] nums) {
        int[] newArr = new int[2 * nums.length];
        newArr[newArr.length - 1] = nums[nums.length - 1];
        return newArr;
    }
}
