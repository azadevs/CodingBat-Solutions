package string_2;

import static base.Base.sc;

public class XyzMiddle {
    public static void main(String[] args) {
        String str = sc.next();
        System.out.println(xyzMiddle(str));
    }

    public static boolean xyzMiddle(String str) {
        int len = str.length();
        if (len < 3) return false;
        int start1 = len / 2 - 2;
        int start2 = len / 2 - 1;
        if (len % 2 == 0) {
            return str.startsWith("xyz", start1) || str.startsWith("xyz", start2);
        }
        return str.startsWith("xyz", start2);
    }
}
