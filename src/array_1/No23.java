package array_1;

import static base.Base.getArray;

public class No23 {
    public static void main(String[] args) {
        int[] nums = getArray(2);
        System.out.println(no23(nums));
    }

    public static boolean no23(int[] nums) {
        for (int e : nums) {
            if (e == 2 || e == 3) return false;
        }
        return true;
    }
}
