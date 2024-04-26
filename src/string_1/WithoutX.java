package string_1;

import static base.Base.sc;

public class WithoutX {
    public static void main(String[] args) {
        String str = sc.next();
        System.out.println(withoutX(str));
    }

    public static String withoutX(String str) {
        if (str.length() > 0 && str.charAt(0)=='x') {
            str = str.substring(1);
        }
        if (str.length() > 0 && str.charAt(str.length()-1)=='x') {
            str = str.substring(0, str.length() - 1);
        }
        return str;
    }
}
