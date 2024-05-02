package recursion_1;

import static base.Base.sc;

public class StringClean {
    public static void main(String[] args) {
        String str = sc.next();
        System.out.println(stringClean(str));
    }

    public static String stringClean(String str) {
        if (str.length() <= 1) return str;
        return str.charAt(0) == str.charAt(1) ? stringClean(str.substring(1)) : str.charAt(0) + stringClean(str.substring(1));
    }
}
