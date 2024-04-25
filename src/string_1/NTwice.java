package string_1;

import static base.Base.sc;

public class NTwice {
    public static void main(String[] args) {
        String str = sc.next();
        int n = sc.nextInt();
        System.out.println(nTwice(str, n));
    }

    public static String nTwice(String str, int n) {
        return str.substring(0, n) + str.substring(str.length() - n);
    }
}
