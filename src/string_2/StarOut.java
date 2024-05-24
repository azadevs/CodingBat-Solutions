package string_2;

import static base.Base.sc;

public class StarOut {
    public static void main(String[] args) {
        String str = sc.next();
        System.out.println(starOut(str));
    }

    public static String starOut(String str) {
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 && str.charAt(i) != '*') newStr.append(str.charAt(i));
            if (i > 0 && str.charAt(i) != '*' && str.charAt(i - 1) != '*') newStr.append(str.charAt(i));
            if (i > 0 && str.charAt(i) == '*' && str.charAt(i - 1) != '*')
                newStr = new StringBuilder(newStr.substring(0, newStr.length() - 1));
        }
        return newStr.toString();
    }
}
