package array_2;

public class ShiftLeft {
    public int[] shiftLeft(int[] nums){
        for (int i = 0; i < nums.length-1; i++) {
            int a=nums[i];
            nums[i]=nums[i+1];
            nums[i+1]=a;
        }
        return nums;
    }
}
