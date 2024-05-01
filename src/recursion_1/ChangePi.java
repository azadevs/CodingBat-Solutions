package recursion_1;

import static base.Base.sc;

public class ChangePi {
    public static void main(String[] args) {
        String str = sc.next();
        System.out.println(changePi(str));
    }

    public static String changePi(String str) {
        if (str.length() == 0) return str;
        return str.startsWith("pi") ? "3.14" + changePi(str.substring(2)) : str.charAt(0) + changePi(str.substring(1));
    }
}
