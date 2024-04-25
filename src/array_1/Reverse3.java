package array_1;

import java.util.Arrays;

import static base.Base.getArray;

public class Reverse3 {
    public static void main(String[] args) {
        int[] arr = getArray(3);
        System.out.println(Arrays.toString(reverse3(arr)));
    }

    public static int[] reverse3(int[] nums) {
        return new int[]{nums[2], nums[1], nums[0]};
    }
}
