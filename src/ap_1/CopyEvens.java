package ap_1;

public class CopyEvens {
    public int[] copyEvens(int[] nums, int count) {
        int[] res = new int[count];
        int j=0;
        for (int num : nums) {
            if (num % 2 == 0 && j< res.length) res[j++] = num;
        }
        return res;
    }
}
