package array_1;

import static base.Base.getArray;

public class Has23 {
    public static void main(String[] args) {
        int[] arr = getArray(2);
        System.out.println(has23(arr));
    }

    public static boolean has23(int[] nums) {
        for (int e : nums) {
            if (e == 2 || e == 3) {
                return true;
            }
        }
        return false;
    }
}
