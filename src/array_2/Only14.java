package array_2;

public class Only14 {
    public boolean only14(int[] nums){
        boolean bool=true;
        for (int num : nums) {
            if (num != 1 && num != 4) return false;
        }
        return bool;
    }
}
