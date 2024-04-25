package string_1;

import static base.Base.sc;

public class HasBad {
    public static void main(String[] args) {
        String str = sc.next();
        System.out.println(hasBad(str));
    }

    public static boolean hasBad(String str) {
        int len = str.length();
        String b = "bad";
        if (len < 3) return false;
        return str.substring(1).startsWith(b) || str.startsWith(b);
    }
}
