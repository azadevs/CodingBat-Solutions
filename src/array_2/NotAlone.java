package array_2;

public class NotAlone {
    public int[] notAlone(int[] nums, int val) {
        for (int i = 1; i < nums.length-1; i++) {
            if (nums[i] == val && nums[i-1]!=nums[i] ) {
                int max=Math.max(nums[i-1],nums[i+1]);
                nums[i]=max;
            }
        }
        return nums;
    }
}
