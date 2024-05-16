package string_2;

import static base.Base.sc;

public class PrefixAgain {
    public static void main(String[] args) {
        String str = sc.next();
        int n = sc.nextInt();
        System.out.println(prefixAgain(str, n));
    }

    public static boolean prefixAgain(String str, int n) {
        return str.substring(n).contains(str.substring(0, n));
    }
}
