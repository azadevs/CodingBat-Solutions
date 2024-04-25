package array_1;

import java.util.Random;

import static base.Base.sc;

public class SameFirstLast {
    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Random().nextInt(10);
        }
        System.out.println(sameFirstLast(arr));
    }

    public static boolean sameFirstLast(int[] nums) {
        int len = nums.length;
        return len != 0 && nums[0] == nums[len - 1];
    }
}
