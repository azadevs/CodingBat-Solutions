package recursion_1;

import static base.Base.sc;

public class CountX {
    public static void main(String[] args) {
        String str = sc.next();
        System.out.println(countX(str));
    }

    public static int countX(String str) {
        if (str.length() < 1) return 0;
        return str.charAt(str.length() - 1) == 'x' ? 1 + countX(str.substring(0, str.length() - 1)) : countX(str.substring(0, str.length() - 1));
    }
}
