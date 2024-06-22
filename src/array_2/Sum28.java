package array_2;

public class Sum28 {
    public boolean sum28(int[] nums){
        int sum=0;
        for(int n:nums){
            if(n==2) sum+=n;
        }
        return sum==8;
    }
}
