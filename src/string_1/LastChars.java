package string_1;

import static base.Base.sc;

public class LastChars {
    public static void main(String[] args) {
        String a = sc.next();
        String b = sc.next();
        System.out.println(lastChars(a, b));
    }


    public static String lastChars(String a, String b) {
        int lenA = a.length();
        int lenB = b.length();
        return (lenA > 0 ? a.substring(0, 1) : "@") + (lenB > 0 ? b.substring(lenB - 1) : "@");
    }
}
