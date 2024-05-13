package string_2;

import static base.Base.sc;

public class MixString {
    public static void main(String[] args) {
        String a = sc.next();
        String b = sc.next();
        System.out.println(mixString(a, b));
    }

    public static String mixString(String a, String b) {
        StringBuilder builder = new StringBuilder();
        int max = Math.max(a.length(), b.length());
        for (int i = 0; i < max; i++) {
            if (i < a.length() && i < b.length()) {
                builder.append(a.charAt(i)).append(b.charAt(i));
            } else if (i < a.length()) builder.append(a.charAt(i));
            else builder.append(b.charAt(i));
        }
        return builder.toString();
    }
}
