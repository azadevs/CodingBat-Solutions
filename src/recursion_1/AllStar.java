package recursion_1;

import static base.Base.sc;

public class AllStar {
    public static void main(String[] args) {
        String str = sc.next();
        System.out.println(allStar(str));
    }

    public static String allStar(String str) {
        if (str.length() <= 1) return str;
        return str.charAt(0) + "*" + allStar(str.substring(1));
    }
}
