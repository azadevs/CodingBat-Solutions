package array_1;

import static base.Base.getArray;
import static base.Base.sc;

public class Double23 {
    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arr = getArray(n);
        System.out.println(double23(arr));
    }

    public static boolean double23(int[] nums) {
        if (nums.length < 2) return false;
        int count2 = 0;
        int count3 = 0;
        for (int e : nums) {
            if (e == 2) count2++;
            if (e == 3) count3++;
        }
        return count2 == 2 || count3 == 2;
    }
}
