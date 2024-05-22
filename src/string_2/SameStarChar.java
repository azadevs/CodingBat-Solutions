package string_2;

import static base.Base.sc;

public class SameStarChar {
    public static void main(String[] args) {
        String str = sc.next();
        System.out.println(sameStarChar(str));
    }

    public static boolean sameStarChar(String str) {
        if (str.length() < 3 || !str.contains("*")) return true;
        boolean bool = false;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == '*' && i != 0) {
                bool = str.charAt(i - 1) == str.charAt(i + 1);
            }
        }
        return bool;
    }
}
