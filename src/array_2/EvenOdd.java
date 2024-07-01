package array_2;

public class EvenOdd {
    public int[] evenOdd(int[] nums){
        int[] arr=new int[nums.length];
        for (int i = 0,j=0,k=0; i < nums.length; i++) {
            if(nums[i]%2==1){
                arr[arr.length-1-j++]=nums[i];
            }else{
                arr[k++]=nums[i];
            }
        }
        return arr;
    }
}
