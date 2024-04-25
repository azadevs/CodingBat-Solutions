package array_1;

import java.util.Arrays;

import static base.Base.getArray;

public class Sum3 {
    public static void main(String[] args) {
        System.out.println("Your array elements");
        int[] arr = getArray(3);
        System.out.println(Arrays.toString(arr));

        System.out.println(sum3(arr));
    }

    public static int sum3(int[] nums) {
        int sum = 0;
        for (int e : nums) {
            sum += e;
        }
        return sum;
    }
}
