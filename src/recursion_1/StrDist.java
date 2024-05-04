package recursion_1;

import static base.Base.sc;

public class StrDist {
    public static void main(String[] args) {
        String str = sc.next();
        String sub = sc.next();
        System.out.println(strDist(str, sub));
    }

    public static int strDist(String str, String sub) {
        if (str.equals(sub)) return sub.length();
        else if (str.length() <= sub.length()) return 0;
        return str.startsWith(sub) && str.endsWith(sub) ? str.length() : str.startsWith(sub) ? strDist(str.substring(0, str.length() - 1), sub) : strDist(str.substring(1), sub);
    }
}
