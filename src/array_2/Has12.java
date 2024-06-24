package array_2;

public class Has12 {
    public boolean has12(int[] nums){
        boolean b=false;
        for (int n:nums){
            if(n==1) b=true;
            if(n==2 && b) return true;
        }
        return false;
    }
}
