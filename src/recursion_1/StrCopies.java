package recursion_1;

import static base.Base.sc;

public class StrCopies {
    public static void main(String[] args) {
        String str = sc.next();
        String sub = sc.next();
        int n = sc.nextInt();
        System.out.println(strCopies(str, sub, n));
    }

    public static boolean strCopies(String str, String sub, int n) {
        if (n == 0) return true;
        else if (str.length() < sub.length()) return false;
        return str.startsWith(sub) ? strCopies(str.substring(1), sub, n - 1) : strCopies(str.substring(1), sub, n);

    }
}

