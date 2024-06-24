package array_2;

public class HaveThree {
    public boolean haveThree(int[] nums){
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==3){
                count++;
                i++;
            }
        }
        return count==3;
    }
}
