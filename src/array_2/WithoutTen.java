package array_2;

public class WithoutTen {
    public int[] withoutTen(int[] nums){
        int[] arr=new int[nums.length];
        for (int i = 0, j=0; i < nums.length; i++) {
            if(nums[i]!=10) arr[j++]=nums[i];
        }
        return arr;
    }
}
