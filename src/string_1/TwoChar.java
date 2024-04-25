package string_1;

import static base.Base.sc;

public class TwoChar {
    public static void main(String[] args) {
        String str = sc.next();
        int index = sc.nextInt();
        System.out.println(twoChar(str, index));
    }

    public static String twoChar(String str, int index) {
        int len = str.length();
        if (len - 1 <= index || index <= 0) {
            return str.substring(0, 2);
        }
        return str.substring(index, index + 2);
    }
}
