package string_2;

import static base.Base.sc;

public class RepeatEnd {
    public static void main(String[] args) {
        String str = sc.nextLine();
        int n = sc.nextInt();
        System.out.println(repeatEnd(str, n));
    }

    public static String repeatEnd(String str, int n) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            builder.append(str.substring(str.length() - n));
        }
        return builder.toString();

        // 2-solution
//        return str.substring(str.length() - n).repeat(Math.max(0, n));
    }

}
