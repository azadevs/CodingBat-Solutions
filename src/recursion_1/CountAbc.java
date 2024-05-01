package recursion_1;

import static base.Base.sc;

public class CountAbc {
    public static void main(String[] args) {
        String str = sc.next();
        System.out.println(countAbc(str));
    }

    public static int countAbc(String str) {
        if (str.length() < 3) return 0;
        return str.startsWith("abc") || str.startsWith("aba") ? 1 + countAbc(str.substring(1)) : countAbc(str.substring(1));
    }
}
