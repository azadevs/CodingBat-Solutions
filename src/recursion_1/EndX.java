package recursion_1;

import static base.Base.sc;

public class EndX {
    public static void main(String[] args) {
        String str = sc.next();
        System.out.println(endX(str));
    }

    public static String endX(String str) {
        if (str.length() <= 1) return str;
        return str.charAt(0) == 'x' ? endX(str.substring(1)) + "x" : str.charAt(0) + endX(str.substring(1));
    }
}
