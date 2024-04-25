package string_1;

import static base.Base.sc;

public class AtFirst {
    public static void main(String[] args) {
        String str = sc.next();
        System.out.println(atFirst(str));
    }

    public static String atFirst(String str) {
        int len = str.length();
        return len >= 2 ? str.substring(0, 2) : (len == 1 ? str + "@" : "@@");
    }
}
