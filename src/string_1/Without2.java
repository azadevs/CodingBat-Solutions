package string_1;

import static base.Base.sc;

public class Without2 {
    public static void main(String[] args) {
        String str = sc.next();
        System.out.println(without2(str));
    }

    public static String without2(String str) {
        int len = str.length();
        return len >= 2 ? (str.endsWith(str.substring(0, 2)) ? str.substring(2) : str) : str;
    }
}
