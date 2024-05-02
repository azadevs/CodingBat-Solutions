package recursion_1;

import static base.Base.sc;

public class ParenBit {
    public static void main(String[] args) {
        String str = sc.next();
        System.out.println(parenBit(str));
    }

    public static String parenBit(String str) {
        if (str.length() == 0) return str;
        return str.charAt(0) == '(' ? str.substring(0, str.indexOf(")") + 1) : parenBit(str.substring(1));
    }
}
