package string_2;

import static base.Base.sc;

public class GetSandwich {
    public static void main(String[] args) {
        String str = sc.next();
        System.out.println(getSandwich(str));
    }

    public static String getSandwich(String str) {
        if (str.length() <= 10) return "";
        int firstBread = str.indexOf("bread");
        if (firstBread == -1) return "";
        int lastBread = str.lastIndexOf("bread");
        if (lastBread == -1) return "";
        return str.substring(firstBread + 5, lastBread);
    }
}
