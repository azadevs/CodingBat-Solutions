package recursion_1;

import static base.Base.sc;

public class NestParen {
    public static void main(String[] args) {
        String str = sc.next();
        System.out.println(nestParen(str));
    }

    public static boolean nestParen(String str) {
        if (str.length() == 0) return true;
        return str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')' && nestParen(str.substring(1, str.length() - 1));
    }
}
