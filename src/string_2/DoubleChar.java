package string_2;

import static base.Base.sc;

public class DoubleChar {
    public static void main(String[] args) {
        String str = sc.nextLine();
        System.out.println(doubleChar(str));
    }

    public static String doubleChar(String str) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            builder.append(str.charAt(i)).append(str.charAt(i));
        }
        return builder.toString();
    }
}
