package array_2;

public class Lucky13 {
    public boolean lucky13(int[] nums){
        boolean b=true;
        for (int num : nums) {
            if (num == 1 || num == 3) {
                b = false;
                break;
            }
        }
        return b;
    }
}
