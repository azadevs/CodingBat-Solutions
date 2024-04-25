package array_1;

import java.util.Arrays;

import static base.Base.getArray;
import static base.Base.sc;

public class Make2 {
    public static void main(String[] args) {
        int nA = sc.nextInt();
        int nB = sc.nextInt();
        int[] a = getArray(nA);
        int[] b = getArray(nB);
        System.out.println(Arrays.toString(make2(a, b)));
    }

    public static int[] make2(int[] a, int[] b) {
        int lenA = a.length;
        int lenB = b.length;
        if (lenA == 0) return new int[]{b[0], b[1]};
        else if (lenB == 0) return new int[]{a[0], a[1]};
        else if (lenA >= 2) return new int[]{a[0], a[1]};
        else if (lenB >= 2) return new int[]{a[0], b[0]};
        return new int[]{a[0], b[0]};
    }
}
