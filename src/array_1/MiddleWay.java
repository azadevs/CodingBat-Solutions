package array_1;

import java.util.Arrays;

import static base.Base.getArray;

public class MiddleWay {
    public static void main(String[] args) {
        int[] a = getArray(3);
        int[] b = getArray(3);
        System.out.println(Arrays.toString(middleWay(a, b)));
    }

    public static int[] middleWay(int[] a, int[] b) {
        int middleA = a[a.length - 2];
        int middleB = b[b.length - 2];
        return new int[]{middleA, middleB};
    }
}
