package array_2;

public class Either24 {
    public boolean either24(int[] nums){
        boolean b2=false;
        boolean b4=false;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]==2 && nums[i+1]==2) b2=true;
            if(nums[i]==4 && nums[i+1]==4) b4=true;
        }
        return b2!=b4;
    }
}
