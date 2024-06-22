package array_2;

public class More14 {
    public boolean more14(int[] nums){
        int count1=0; int count4=0;
        for (int n:nums){
            if(n==1) count1++;
            if(n==4) count4++;
        }
        return count1>count4;
    }
}
