package array_1;

import java.util.Arrays;

import static base.Base.getArray;

public class PlusTwo {
    public static void main(String[] args) {
        int[] a = getArray(2);
        int[] b = getArray(2);
        System.out.println(Arrays.toString(plusTwo(a, b)));
    }

    public static int[] plusTwo(int[] a, int[] b) {
        return new int[]{a[0], a[1], b[0], b[1]};
    }
}
