package string_1;

import static base.Base.sc;

public class ComboString {
    public static void main(String[] args) {
        String a = sc.next();
        String b = sc.next();
        System.out.println(comboString(a, b));
    }

    public static String comboString(String a, String b) {
        int lenA = a.length();
        int lenB = b.length();
        return lenA > lenB ? b + a + b : a + b + a;
    }
}
