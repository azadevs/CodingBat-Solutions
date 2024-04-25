package array_1;

import java.util.Arrays;

import static base.Base.getArray;

public class BiggerTwo {
    public static void main(String[] args) {
        int[] a = getArray(2);
        int[] b = getArray(2);
        System.out.println(Arrays.toString(biggerTwo(a, b)));
    }

    public static int[] biggerTwo(int[] a, int[] b) {
        int sumA = a[0] + a[1];
        int sumB = b[0] + b[1];
        if (sumA == sumB) return a;
        else if (sumA > sumB) return a;
        else return b;
    }
}
