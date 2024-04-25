package string_1;

import java.util.Scanner;

public class MakeTags {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tag = sc.next();
        String word = sc.next();
        System.out.println(makeTags(tag, word));
    }

    public static String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }
}
