package string_1;

import static base.Base.sc;

public class EndsLy {
    public static void main(String[] args) {
        String str = sc.next();
        System.out.println(endsLy(str));
    }

    public static boolean endsLy(String str) {
        return str.endsWith("ly");
    }
}
