package array_1;

import java.util.Arrays;

import static base.Base.getArray;
import static base.Base.sc;

public class MakeEnds {
    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arr = getArray(n);
        System.out.println(Arrays.toString(makeEnds(arr)));
    }

    public static int[] makeEnds(int[] nums) {
        int len = nums.length;
        return len == 1 ? new int[]{nums[0], nums[0]} : new int[]{nums[0], nums[len - 1]};
    }
}
