package array_2;

public class ZeroFront {
    public int[] zeroFront(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0, j = 0, k = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                arr[j++] = nums[i];
            } else {
                arr[arr.length - 1 - k++] = nums[i];
            }
        }
        return arr;
    }
}
