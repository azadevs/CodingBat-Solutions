package string_2;

import static base.Base.sc;

public class RepeatFront {
    public static void main(String[] args) {
        String str = sc.nextLine();
        int n = sc.nextInt();
        System.out.println(repeatFront(str, n));
    }

    public static String repeatFront(String str, int n) {
        StringBuilder builder = new StringBuilder();
        for (int i = n; i >= 0; i--) {
            builder.append(str, 0, i);
        }
        return builder.toString();
    }

}
