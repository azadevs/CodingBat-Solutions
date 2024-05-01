package recursion_1;

import static base.Base.sc;

public class CountPairs {
    public static void main(String[] args) {
        String str = sc.next();
        System.out.println(countPairs(str));
    }

    public static int countPairs(String str) {
        if (str.length() <= 2) return 0;
        return str.charAt(0) == str.charAt(2) ? 1 + countPairs(str.substring(1)) : countPairs(str.substring(1));
    }
}
