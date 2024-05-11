package string_2;

import static base.Base.sc;

public class XyBalance {
    public static void main(String[] args) {
        String str = sc.nextLine();
        System.out.println(xyBalance(str));
    }

    public static boolean xyBalance(String str) {
        boolean bool = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x' && !bool) {
                bool = true;
            } else if (str.charAt(i) == 'y' && bool) bool = false;
        }
        return !bool;
    }
}
