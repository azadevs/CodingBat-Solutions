package string_2;

import static base.Base.sc;

public class WordEnds {
    public static void main(String[] args) {
        String str = sc.next();
        String word = sc.next();
        System.out.println(wordEnds(str, word));
    }

    public static String wordEnds(String str, String word) {
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < str.length() - word.length() + 1; i++) {
            String temp = str.substring(i, i + word.length());
            if (i > 0 && temp.equals(word)) {
                newStr.append(str.charAt(i - 1));
            }
            if (i < str.length() - word.length() && temp.equals(word)) {
                newStr.append(str.charAt(i + word.length() + 1));
            }
        }
        return newStr.toString();
    }

}
