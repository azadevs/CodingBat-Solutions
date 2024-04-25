package string_1;

import static base.Base.sc;

public class FrontAgain {
    public static void main(String[] args) {
        String str = sc.next();
        System.out.println(frontAgain(str));
    }

    public static boolean frontAgain(String str) {
        if (str.length() < 2) return false;
        return str.endsWith(str.substring(0, 2));
    }
}
