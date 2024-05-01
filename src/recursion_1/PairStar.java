package recursion_1;

import static base.Base.sc;

public class PairStar {
    public static void main(String[] args) {
        String str = sc.next();
        System.out.println(pairStar(str));
    }

    public static String pairStar(String str) {
        if (str.length() <= 1) return str;
        return str.charAt(0) == str.charAt(1) ? str.charAt(0) + "*" + pairStar(str.substring(1)) : str.charAt(0) + pairStar(str.substring(1));
    }
}
