package array_1;

import java.util.Arrays;

import static base.Base.getArray;
import static base.Base.sc;

public class Front11 {
    public static void main(String[] args) {
        int nA = sc.nextInt();
        int nB = sc.nextInt();
        int[] a = getArray(nA);
        int[] b = getArray(nB);
        System.out.println(Arrays.toString(front11(a, b)));
    }
    public static int[] front11(int[] a, int[] b) {
        int lenA = a.length;
        int lenB = b.length;
        if (lenA == 0 && lenB == 0) return new int[]{};
        return lenA > 0 && lenB > 0 ? new int[]{a[0], b[0]} : (new int[]{lenA > 0 ? a[0] : b[0]});
    }
}
