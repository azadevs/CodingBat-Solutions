package array_3;

public class MaxSpan {
    public static int maxSpan(int[] nums) {
        if(nums.length==0) return 0;
        int max = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            int firstNum = nums[i];
            int lastIndex = 0;
            for (int j = nums.length - 1; j > i; j--) {
                if (firstNum == nums[j]) {
                    lastIndex = j;
                    break;
                }
            }
            max = Math.max(max, Math.abs(i - lastIndex) + 1);
        }
        return max;
    }
}
