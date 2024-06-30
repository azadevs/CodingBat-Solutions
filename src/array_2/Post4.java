package array_2;

public class Post4 {
    public int[] post4(int[] nums) {
        int index = nums.length - 1;
        while (nums[index] != 4) {
            index--;
        }
        int[] res = new int[nums.length - 1 - index];
        for (int i = index + 1, j = 0; i < nums.length; i++) {
            res[j++] = nums[i];
        }
        return res;
    }
}
