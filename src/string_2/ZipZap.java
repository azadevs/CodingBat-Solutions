package string_2;

import static base.Base.sc;

public class ZipZap {
    public static void main(String[] args) {
        String str = sc.next();
        System.out.println(zipZap(str));
    }

    public static String zipZap(String str) {
        int len = str.length();
        if (len < 3) return str;
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
                newStr.append("z").append("p");
                i += 2;
            } else newStr.append(str.charAt(i));
        }
        return newStr.toString();

    }
}
