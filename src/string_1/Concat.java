package string_1;

import static base.Base.sc;

public class Concat {
    public static void main(String[] args) {
        String a = sc.next();
        String b = sc.next();
        System.out.println(concat(a, b));
    }

    public static String concat(String a, String b) {
        if (a.isEmpty() || b.isEmpty()) return a.concat(b);
        return a.charAt(a.length() - 1) == b.charAt(0) ? a.concat(b.substring(1)) : a.concat(b);
    }
}
