package array_3;

public class CanBalance {
    public static boolean canBalance(int[] nums) {
        int firstSide = 0;
        int secondSide = 0;
        for (int num : nums) {
            secondSide += num;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            firstSide += nums[i];
            secondSide -= nums[i];

            if (firstSide == secondSide) {
                return true;
            }
        }
        return false;
    }
}
