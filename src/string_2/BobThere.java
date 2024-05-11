package string_2;

import static base.Base.sc;

public class BobThere {
    public static void main(String[] args) {
        String str = sc.nextLine();
        System.out.println(bobThere(str));
    }

    public static boolean bobThere(String str) {
        if (str.length() < 3) return false;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).startsWith("b") && str.substring(i, i + 3).endsWith("b")) return true;
        }
        return false;
    }
}
