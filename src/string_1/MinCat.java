package string_1;

import static base.Base.sc;

public class MinCat {
    public static void main(String[] args) {
        String a = sc.next();
        String b = sc.next();
        System.out.println(minCat(a, b));
    }

    public static String minCat(String a, String b) {
        int lenA = a.length();
        int lenB = b.length();
        return lenA > lenB ? a.substring(lenA - lenB) + b : a + b.substring(lenB - lenA);
    }
}
