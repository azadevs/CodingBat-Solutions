package string_1;

import java.util.Scanner;

public class MakeOutWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String out = sc.next();
        String word = sc.next();
        System.out.println(makeOutWord(out, word));
    }

    public static String makeOutWord(String out, String word) {
        return out.substring(0, 2) + word + out.substring(2);
    }
}
