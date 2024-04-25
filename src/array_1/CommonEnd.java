package array_1;

import java.util.Arrays;

import static base.Base.getArray;
import static base.Base.sc;

public class CommonEnd {
    public static void main(String[] args) {
        int nA = sc.nextInt();
        int nB = sc.nextInt();

        System.out.println(Arrays.toString(getArray(nA)));
        System.out.println(Arrays.toString(getArray(nB)));

        System.out.println(commonEnd(getArray(nA), getArray(nB)));
    }

    public static boolean commonEnd(int[] a, int[] b) {
        return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
    }

}
