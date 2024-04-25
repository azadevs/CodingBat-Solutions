package string_1;

import static base.Base.sc;

public class SeeColor {
    public static void main(String[] args) {
        String str = sc.next();
        System.out.println(seeColor(str));
    }

    public static String seeColor(String str) {
        return str.startsWith("red") ? "red" : str.startsWith("blue") ? "blue" : "";
    }
}
