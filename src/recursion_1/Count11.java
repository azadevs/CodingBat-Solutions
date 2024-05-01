package recursion_1;

import static base.Base.sc;

public class Count11 {
    public static void main(String[] args) {
        String str = sc.next();
        System.out.println(count11(str));
    }

    public static int count11(String str) {
        if (str.length() < 2) return 0;
        return str.startsWith("11") ? 1 + count11(str.substring(2)) : count11(str.substring(1));
    }
}
