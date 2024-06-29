package array_2;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Pre4 {
    public int[] pre4(int[] nums) {
        int index = 0;
        while (nums[index] != 4) {
            index++;
        }
        int[] arr = new int[index];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = nums[i];
        }
        return arr;
    }
}
