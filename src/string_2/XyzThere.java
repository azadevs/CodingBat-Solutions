package string_2;

import static base.Base.sc;

public class XyzThere {
    public static void main(String[] args) {
        String str = sc.nextLine();
        System.out.println(xyzThere(str));
    }

    public static boolean xyzThere(String str) {
        boolean bool = false;
        if (str.length() < 3) return false;
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i).startsWith("xyz")) {
                bool = i == 0 || str.charAt(i - 1) != '.';
            }
        }
        return bool;
    }
}
