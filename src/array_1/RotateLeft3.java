package array_1;

import java.util.Arrays;

import static base.Base.getArray;

public class RotateLeft3 {
    public static void main(String[] args) {
        int[] arr = getArray(3);
        System.out.println("Your array elements");
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(rotateLeft3(arr)));
    }

    public static int[] rotateLeft3(int[] nums) {
        return new int[]{nums[1], nums[2], nums[0]};
    }
}
