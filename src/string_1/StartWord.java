package string_1;

import static base.Base.sc;

public class StartWord {
    public static void main(String[] args) {
        String str = sc.next();
        String word = sc.next();
        System.out.println(startWord(str, word));
    }

    public static String startWord(String str, String word) {
        if (str.length() < word.length()) return "";
        String newStr = str.substring(0, word.length());
        return newStr.equals(word) ? newStr : newStr.substring(1).equals(word.substring(1)) ? newStr : "";
    }
}
