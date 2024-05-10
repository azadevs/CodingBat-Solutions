package string_2;

import static base.Base.sc;

public class EndOther {
    public static void main(String[] args) {
        String a = sc.next();
        String b = sc.next();
        System.out.println(endOther(a, b));
    }

    public static boolean endOther(String a, String b) {
        String shortStr = (a.length() > b.length() ? b : a.length() == b.length() ? b : a).toLowerCase();
        String longStr = (a.length() > b.length() ? a : a.length() == b.length() ? a : b).toLowerCase();
        return longStr.endsWith(shortStr);
    }
}
