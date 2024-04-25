package string_1;

import static base.Base.sc;

public class FirstHalf {
    public static void main(String[] args) {
        String str = sc.next();
        System.out.println(firstHalf(str));
    }

    public static String firstHalf(String str) {
        int len = str.length();
        return len <= len / 2 ? str : str.substring(0, len / 2);
    }
}
