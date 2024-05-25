package string_2;

import static base.Base.sc;

public class PlusOut {

    public static void main(String[] args) {
        String str = sc.next();
        String word = sc.next();
        System.out.println(plusOut(str, word));
    }

    public static String plusOut(String str, String word) {
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i).startsWith(word)) {
                newStr.append(word);
                i += word.length();
            } else {
                newStr.append("+");
            }
        }
        return newStr.toString();
    }
}
