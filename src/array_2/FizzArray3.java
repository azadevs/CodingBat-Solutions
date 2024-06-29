package array_2;

public class FizzArray3 {
    public int[] fizzArray3(int start, int end) {
        int[] arr = new int[end - start];
        int j=0;
        for (int i = start; i < end; i++) {
            arr[j++]=i;
        }
        return arr;
    }
}
