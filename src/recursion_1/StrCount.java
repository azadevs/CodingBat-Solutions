package recursion_1;

import static base.Base.sc;

public class StrCount {
    public static void main(String[] args) {
        String str = sc.next();
        String sub = sc.next();
        System.out.println(strCount(str, sub));
    }

    public static int strCount(String str, String sub) {
        if (str.length() < sub.length()) return 0;
        return str.startsWith(sub) ? 1 + strCount(str.substring(sub.length()), sub) : strCount(str.substring(1), sub);
    }
}
