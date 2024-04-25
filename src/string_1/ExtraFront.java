package string_1;

import static base.Base.sc;

public class ExtraFront {
    public static void main(String[] args) {
        String str = sc.next();
        System.out.println(extraFront(str));
    }

    public static String extraFront(String str) {
        int len = str.length();
        if (len == 0) return "";
        StringBuilder builder = new StringBuilder();
        int i = 0;
        while (i < 3) {
            i++;
            if (len < 2) builder.append(str.charAt(0));
            else builder.append(str, 0, 2);
        }
        return builder.toString();
    }
}
