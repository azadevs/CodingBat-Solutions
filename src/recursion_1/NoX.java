package recursion_1;

import static base.Base.sc;

public class NoX {
    public static void main(String[] args) {
        String str = sc.next();
        System.out.println(noX(str));
    }

    public static String noX(String str) {
        if (str.length() == 0) return str;
        return str.charAt(0) == 'x' ? noX(str.substring(1)) : str.charAt(0) + noX(str.substring(1));
    }
}
