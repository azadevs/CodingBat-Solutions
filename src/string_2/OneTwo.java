package string_2;

import static base.Base.sc;

public class OneTwo {
    public static void main(String[] args) {
        String str = sc.next();
        System.out.println(oneTwo(str));
    }

    public static String oneTwo(String str) {
        int len = str.length();
        if (len < 3) return "";
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < len; i++) {
            if (len - i >= 3) {
                newStr.append(str, i + 1, i + 3).append(str.charAt(i));
                i += 2;
            }
        }
        return newStr.toString();
    }
}
