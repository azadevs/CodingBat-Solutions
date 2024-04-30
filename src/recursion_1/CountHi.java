package recursion_1;

import static base.Base.sc;

public class CountHi {
    public static void main(String[] args) {
        String str = sc.next();
        System.out.println(countHi(str));
    }

    public static int countHi(String str) {
        if (str.isEmpty()) return 0;
        return str.startsWith("hi") ? 1 + countHi(str.substring(1)) : countHi(str.substring(1));
    }
}
