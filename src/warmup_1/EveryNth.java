package warmup_1;

import static base.Base.sc;

public class EveryNth {
    public static void main(String[] args) {
        String str = sc.next();
        int n = sc.nextInt();
        System.out.println(everyNth(str, n));
    }

    public static String everyNth(String str, int n) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i += n) {
            builder.append(str.charAt(i));
        }
        return builder.toString();
    }
}
