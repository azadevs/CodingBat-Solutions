package array_1;

import static base.Base.getArray;
import static base.Base.sc;

public class Start1 {
    public static void main(String[] args) {
        int nA = sc.nextInt();
        int nB = sc.nextInt();
        int[] a = getArray(nA);
        int[] b = getArray(nB);
        System.out.println(start1(a, b));
    }

    public static int start1(int[] a, int[] b) {
        int lenA = a.length;
        int lenB = b.length;
        if (lenA < 1 && lenB < 1) return 0;
        if (lenA > 0 && a[0] == 1 && lenB > 0 && b[0] == 1) return 2;
        if (lenA > 0 && a[0] == 1 || lenB > 0 && b[0] == 1) return 1;
        return 0;
    }
}
