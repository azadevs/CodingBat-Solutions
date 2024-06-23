package array_2;

public class No14 {
    public boolean no14(int[] nums){
        boolean b1=false;
        boolean b4=false;
        for(int n:nums){
            if(n==1) b1=true;
            if(n==4) b4=true;
        }
        return !b1 || !b4;
    }
}
