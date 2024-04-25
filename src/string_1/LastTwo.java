package string_1;

import static base.Base.sc;

public class LastTwo {
    public static void main(String[] args) {
        String str = sc.next();
        System.out.println(lastTwo(str));
    }

    public static String lastTwo(String str) {
        if (str.length() < 2) return str;
        return str.substring(0, str.length() - 2) + str.charAt(str.length() - 1) + str.charAt(str.length() - 2);
    }
}
