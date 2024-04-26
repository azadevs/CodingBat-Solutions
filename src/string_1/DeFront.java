package string_1;

import static base.Base.sc;

public class DeFront {
    public static void main(String[] args) {
        String str = sc.next();
        System.out.println(deFront(str));
    }

    public static String deFront(String str) {
        String a = str.charAt(0) + str.substring(2);
        String b = str.charAt(1) + str.substring(2);
        return (str.startsWith("ab") ? str : (str.startsWith("a") ? a : str.substring(1).startsWith("b") ? b : str.substring(2)));
    }
}
