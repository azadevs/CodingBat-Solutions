package string_2;

import static base.Base.sc;

public class RepeatSeparator {
    public static void main(String[] args) {
        String word = sc.next();
        String sep = sc.next();
        int count = sc.nextInt();
        System.out.println(repeatSeparator(word, sep, count));
    }

    public static String repeatSeparator(String word, String sep, int count) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < count; i++) {
            builder.append(word);
            if (i + 1 != count) builder.append(sep);
        }
        return builder.toString();
    }

}
