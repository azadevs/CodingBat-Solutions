package array_2;

public class FizArray2 {
    public String[] fizArray2(int n){
        String[] res=new String[n];
        if(n==0) return res;
        for (int i = 0; i < n; i++) {
            res[i]=String.valueOf(i);
        }
        return res;
    }
}
