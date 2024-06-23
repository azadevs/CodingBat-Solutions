package array_2;

public class FizArray {
    public int[] fizArray(int n){
        int[] res=new int[n];
        if(n==0) return res;
        for (int i = 0; i < n; i++) {
            res[i]=i;
        }
        return res;
    }
}
