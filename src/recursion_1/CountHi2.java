package recursion_1;

import static base.Base.sc;

public class CountHi2 {
    public static void main(String[] args) {
        String str = sc.next();
        System.out.println(countHi2(str));
    }

    public static int countHi2(String str) {
        if (str.length() < 2) return 0;
        return str.startsWith("xhi") ? countHi2(str.substring(3)) : str.startsWith("hi") ? 1 + countHi2(str.substring(2)) : countHi2(str.substring(1));
    }
}
