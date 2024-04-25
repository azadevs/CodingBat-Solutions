package string_1;

import static base.Base.sc;

public class MiddleThree {

    public static void main(String[] args) {
        String str = sc.next();
        System.out.println(middleThree(str));
    }

    public static String middleThree(String str) {
        int len = str.length();
        int mid = len / 2;
        return len > 3 ? str.substring(mid - 1, mid + 2) : str;
    }

}
