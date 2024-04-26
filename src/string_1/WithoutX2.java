package string_1;

import static base.Base.sc;

public class WithoutX2 {
    public static void main(String[] args) {
        String str = sc.next();
        System.out.println(withoutX2(str));
    }

    public static String withoutX2(String str) {
        int len = str.length();
        if (len > 0 && str.startsWith("xx")) return str.substring(2);
        return len > 0 ? str.charAt(0) == 'x' ? str.substring(1) : str.charAt(1) == 'x' ? str.charAt(0) + str.substring(2) : str : str;
    }
}
